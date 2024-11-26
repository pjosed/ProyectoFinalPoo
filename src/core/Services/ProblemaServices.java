package core.Services;

import core.opcion.Opcion;
import core.problema.Problema;
import core.problema.ProblemaCiberadiccion;
import core.problema.ProblemaPhishing;
import core.problema.ProblemaSpoofing;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProblemaServices {

    private HashSet<Integer> ids; // Cambiado a HashSet para manejo eficiente de unicidad

    public ProblemaServices() {
        this.ids = new HashSet<>();
    }

    public Problema leerProblema() {
        String textoProblema = "";
        String tipoProblema = "";

        ArrayList<Opcion> opciones = new ArrayList<>();
        int id = 0;

        try (FileInputStream fis = new FileInputStream(new File("src/files/BD.xlsx"));
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Leer la Hoja 1
            Sheet sheet1 = workbook.getSheetAt(0);
            int totalRows = sheet1.getPhysicalNumberOfRows();
            Random random = new Random();
            Row selectedRow;

            // Seleccionar una fila aleatoria con ID único
            do {
                int randomRowIndex = random.nextInt(totalRows - 1) + 1;
                selectedRow = sheet1.getRow(randomRowIndex);
                if (selectedRow != null && selectedRow.getCell(2) != null) {
                    id = (int) selectedRow.getCell(2).getNumericCellValue();
                    System.out.println(id);
                }
            } while (ids.contains(id));

            ids.add(id); // Registrar el ID como usado
            textoProblema = selectedRow.getCell(1).getStringCellValue();
            tipoProblema = selectedRow.getCell(0).getStringCellValue();

            // Leer la Hoja 2
            Sheet sheet2 = workbook.getSheetAt(1);
            for (Row row : sheet2) {
                if (row.getRowNum() == 0) continue; // Omitir encabezado
                if (row.getCell(0) != null && (int) row.getCell(0).getNumericCellValue() == id) {
                    String textoOpcion = row.getCell(1).getStringCellValue();
                    String explicacion = row.getCell(2).getStringCellValue();
                    int puntaje = (int) row.getCell(3).getNumericCellValue();
                    opciones.add(new Opcion(textoOpcion, puntaje, explicacion));
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo Excel: " + e.getMessage());
        } catch (NullPointerException | ClassCastException e) {
            System.err.println("Error en la estructura de las celdas: " + e.getMessage());
        }
        
        System.out.println(tipoProblema.toLowerCase());
        if("cyberadiccion".equals(tipoProblema.toLowerCase()) ){
            return new ProblemaCiberadiccion(tipoProblema, textoProblema, opciones);
        }
        if("fishing".equals(tipoProblema.toLowerCase()) ){
            return new ProblemaPhishing(tipoProblema, textoProblema, opciones);
        }
        if("spoofing".equals(tipoProblema.toLowerCase()) ){
            return new ProblemaSpoofing(tipoProblema, textoProblema, opciones);
        }
       return null;
    }
    public Boolean lessThanFive() {
        if (5 > ids.size()) {
            return true;
        }
        return false;

    }
}
