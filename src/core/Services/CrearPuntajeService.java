/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author arang
 */
public class CrearPuntajeService {
    
    
    public static void CreaPuntaje(String nickName , double puntos){
    
    String archivoExcel = "src/files/Ranking.xlsx"; // Cambia esta ruta por la del archivo Excel
        try {
            // Cargar el archivo Excel
            FileInputStream fis = new FileInputStream(new File(archivoExcel));
            Workbook workbook = new XSSFWorkbook(fis);  // Para archivos .xlsx (Excel moderno)
            
            // Obtener la primera hoja del archivo
            Sheet sheet = workbook.getSheetAt(0);  // Si es otra hoja, cambia el índice

            // Crear una nueva fila al final de la hoja (índice de la última fila + 1)
            int ultimaFila = sheet.getPhysicalNumberOfRows();
            Row nuevaFila = sheet.createRow(ultimaFila);  // Crea una nueva fila

            // Añadir celdas a la fila
            Cell cell1 = nuevaFila.createCell(0); // Columna 0
            cell1.setCellValue(nickName);

            Cell cell2 = nuevaFila.createCell(1); // Columna 1
            cell2.setCellValue(puntos); // Puntaje, por ejemplo

            // Guardar los cambios en el archivo
            fis.close();  // Cerrar el FileInputStream

            // Escribir los cambios al archivo
            FileOutputStream fos = new FileOutputStream(new File(archivoExcel));
            workbook.write(fos);
            fos.close();

            System.out.println("Fila añadida correctamente.");

        } catch (IOException e) {
        }
    }
    
}
