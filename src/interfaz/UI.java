package interfaz;

import core.Gato;
import core.Services.ProblemaServices;
import core.problema.Problema;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.*;
import static org.apache.poi.ss.usermodel.CellType.BOOLEAN;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author arang
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    
        private ProblemaServices problemaService ;
    private Gato gato ;
     public UI() {
        System.out.println("Inicio UI");
        this.problemaService = new ProblemaServices();
        this.gato = Gato.getInstancia();
        initComponents();
        MainPanel.removeAll();
        MainPanel.add(Inicio);
        MainPanel.repaint();
        MainPanel.revalidate();  
        
        
        
    }

        
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Puntuaciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Juego = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        gatoNormalLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Problem = new javax.swing.JTextArea();
        Opcion1 = new javax.swing.JButton();
        Opcion2 = new javax.swing.JButton();
        Opcion3 = new javax.swing.JButton();
        Opcion4 = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        Creditos = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Tutorial = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IngresarUsuario = new javax.swing.JPanel();
        textField1 = new java.awt.TextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        MainPanel.setLayout(new java.awt.CardLayout());

        Inicio.setPreferredSize(new java.awt.Dimension(1152, 648));
        Inicio.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonIniciar.PNG"))); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Inicio.add(jButton1);
        jButton1.setBounds(180, 360, 190, 70);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonTutorial.PNG"))); // NOI18N
        jButton2.setText("Tutorial");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Inicio.add(jButton2);
        jButton2.setBounds(390, 360, 180, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonCreditos.PNG"))); // NOI18N
        jButton3.setText("Creditos");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Inicio.add(jButton3);
        jButton3.setBounds(840, 360, 180, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonPuntuacion.PNG"))); // NOI18N
        jButton4.setText("Puntuacion");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Inicio.add(jButton4);
        jButton4.setBounds(590, 360, 220, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InicioMenu.gif"))); // NOI18N
        Inicio.add(jLabel1);
        jLabel1.setBounds(-3, -4, 1160, 660);

        MainPanel.add(Inicio, "card3");

        Puntuaciones.setPreferredSize(new java.awt.Dimension(800, 600));
        Puntuaciones.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        Puntuaciones.add(jScrollPane2);
        jScrollPane2.setBounds(152, 150, 770, 360);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonRegresar.PNG"))); // NOI18N
        jButton7.setText("Salir");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Puntuaciones.add(jButton7);
        jButton7.setBounds(30, 10, 200, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Puntuacion.gif"))); // NOI18N
        Puntuaciones.add(jLabel6);
        jLabel6.setBounds(-20, 0, 1210, 620);

        MainPanel.add(Puntuaciones, "card2");

        Juego.setPreferredSize(new java.awt.Dimension(800, 600));
        Juego.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1154, 680));
        jPanel3.setLayout(null);

        gatoNormalLabel.setForeground(new java.awt.Color(255, 255, 255));
        gatoNormalLabel.setText("Gatoo");
        jPanel3.add(gatoNormalLabel);
        gatoNormalLabel.setBounds(510, 550, 70, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonRegresar.PNG"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(40, 40, 200, 60);

        Problem.setEditable(false);
        Problem.setBackground(new java.awt.Color(0, 0, 0));
        Problem.setColumns(10);
        Problem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Problem.setForeground(new java.awt.Color(255, 255, 255));
        Problem.setLineWrap(true);
        Problem.setRows(3);
        Problem.setWrapStyleWord(true);
        Problem.setBorder(null);
        Problem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Problem.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane4.setViewportView(Problem);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(30, 120, 660, 130);

        Opcion1.setForeground(new java.awt.Color(255, 255, 255));
        Opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonOpciones.png"))); // NOI18N
        Opcion1.setText("Opcion1");
        Opcion1.setToolTipText("");
        Opcion1.setBorderPainted(false);
        Opcion1.setContentAreaFilled(false);
        Opcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ActionPerformed(evt);
            }
        });
        jPanel3.add(Opcion1);
        Opcion1.setBounds(30, 310, 530, 90);

        Opcion2.setForeground(new java.awt.Color(255, 255, 255));
        Opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonOpciones.png"))); // NOI18N
        Opcion2.setText("Opcion2");
        Opcion2.setBorderPainted(false);
        Opcion2.setContentAreaFilled(false);
        Opcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });
        jPanel3.add(Opcion2);
        Opcion2.setBounds(600, 310, 530, 90);

        Opcion3.setForeground(new java.awt.Color(255, 255, 255));
        Opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonOpciones.png"))); // NOI18N
        Opcion3.setText("Opcion3");
        Opcion3.setBorderPainted(false);
        Opcion3.setContentAreaFilled(false);
        Opcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ActionPerformed(evt);
            }
        });
        jPanel3.add(Opcion3);
        Opcion3.setBounds(30, 460, 530, 90);

        Opcion4.setForeground(new java.awt.Color(255, 255, 255));
        Opcion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonOpciones.png"))); // NOI18N
        Opcion4.setText("Opcion4");
        Opcion4.setBorderPainted(false);
        Opcion4.setContentAreaFilled(false);
        Opcion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });
        jPanel3.add(Opcion4);
        Opcion4.setBounds(600, 460, 530, 90);

        jProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar.setForeground(new java.awt.Color(102, 102, 255));
        jProgressBar.setMaximum(1000);
        jPanel3.add(jProgressBar);
        jProgressBar.setBounds(830, 70, 250, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoJuego.gif"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, -10, 1160, 680);

        Juego.add(jPanel3);
        jPanel3.setBounds(0, 0, 1468, 750);

        MainPanel.add(Juego, "card2");

        Creditos.setPreferredSize(new java.awt.Dimension(800, 600));
        Creditos.setLayout(null);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/BotonRegresar.PNG"))); // NOI18N
        jButton8.setText("Salir");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Creditos.add(jButton8);
        jButton8.setBounds(50, 30, 200, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Creditos_1.gif"))); // NOI18N
        Creditos.add(jLabel4);
        jLabel4.setBounds(0, -30, 1160, 710);

        MainPanel.add(Creditos, "card2");

        Tutorial.setPreferredSize(new java.awt.Dimension(800, 600));
        Tutorial.setLayout(null);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonEscuchar.PNG"))); // NOI18N
        jButton6.setText("Escuchar");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tutorial.add(jButton6);
        jButton6.setBounds(907, 33, 200, 60);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonRegresar.PNG"))); // NOI18N
        jButton9.setText("Exit");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Tutorial.add(jButton9);
        jButton9.setBounds(70, 30, 190, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tutorial.gif"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 680));
        Tutorial.add(jLabel3);
        jLabel3.setBounds(0, -20, 1190, 690);

        MainPanel.add(Tutorial, "card2");

        IngresarUsuario.setPreferredSize(new java.awt.Dimension(800, 600));
        IngresarUsuario.setLayout(null);

        textField1.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        IngresarUsuario.add(textField1);
        textField1.setBounds(670, 320, 350, 40);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonRegresar.PNG"))); // NOI18N
        jButton10.setText("Exit");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        IngresarUsuario.add(jButton10);
        jButton10.setBounds(40, 30, 190, 70);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotonJugar_1.PNG"))); // NOI18N
        jButton11.setText("jButton11");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        IngresarUsuario.add(jButton11);
        jButton11.setBounds(520, 480, 170, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IngresarUsuario.gif"))); // NOI18N
        IngresarUsuario.add(jLabel5);
        jLabel5.setBounds(0, -30, 1390, 710);

        MainPanel.add(IngresarUsuario, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    MainPanel.removeAll();
        MainPanel.add(Creditos);
        MainPanel.repaint();
        MainPanel.revalidate();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            MainPanel.removeAll();
        MainPanel.add(Tutorial);
        MainPanel.repaint();
        MainPanel.revalidate();  
         JTextArea tutorialText = new JTextArea(
        "En este juego debes ayudar al gato, Mr Microfost, a través de diversas situaciones que pondrán a prueba su nivel de ánimo. \n\n"
        + "Jugarás 5 rondas, y por cada ronda verás una situación relacionada a los riesgos informáticos a los cuáles se enfrentará Mr Microfost y por la cuál tú, debes escoger la mejor opción para ayudarlo a lidiar con ella.\n\n"
        + "No existe una respuesta correcta o incorrecta, simplemente respuestas más o menos adecuadas según el contexto. Por cada opción elevarás en una cierta cantidad el estado de ánimo de Mr Microfost, y tu objetivo es mantenerlo mayor o igual al 60%. Dependiendo de qué tan alto mantengas su nivel de ánimo hacia el final del juego, lograrás una mayor puntuación.\n\n"
        + "¡Buena suerte!"
    );
    tutorialText.setLineWrap(true);
    tutorialText.setWrapStyleWord(true);
    tutorialText.setEditable(false);
    Tutorial.add(tutorialText);  // Agregar el texto al panel Tutorial

    tutorialText.setBounds(20, 20, 540, 300); // Ajustar tamaño y posición
    Tutorial.setLayout(null); // Asegurar diseño absoluto
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainPanel.removeAll();
        MainPanel.add(IngresarUsuario);
        MainPanel.repaint();
        MainPanel.revalidate();     // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    java.awt.EventQueue.invokeLater(() -> {
        this.dispose();
        UI ui = new UI();
        ui.setSize(1152, 690);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
    });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    MainPanel.removeAll();
        MainPanel.add(Puntuaciones);
        MainPanel.repaint();
        MainPanel.revalidate();     
    }
        private DefaultTableModel tableModel; // Declarar el modelo de tabla como variable global

private void initializeScoreTable() {
    // Inicializar el modelo de tabla
    String[] columnNames = {"Usuario", "Puntos"};
    tableModel = new DefaultTableModel(columnNames, 0);
}

private void updateScores(String usuario, int puntos) {
    // Agregar nuevos datos de puntuaciones
    tableModel.addRow(new Object[]{usuario, puntos});

    // Ordenar la tabla de puntuaciones de mayor a menor
    tableModel.getDataVector().sort((o1, o2) -> {
        int points1 = (int) ((Vector<?>) o1).get(1);
        int points2 = (int) ((Vector<?>) o2).get(1);
        return Integer.compare(points2, points1); // Ordenar descendente
    });
    tableModel.fireTableDataChanged(); // Notificar cambios en los datos
    
    JTable table = new JTable(tableModel);
    table.setEnabled(false); // Deshabilitar edición

    JScrollPane scrollPane = new JScrollPane(table); // Agregar scroll a la tabla
    scrollPane.setBounds(20, 20, 300, 150); // Posición y tamaño del scroll pane

    Puntuaciones.setLayout(null);
    Puntuaciones.removeAll(); // Limpiar panel antes de agregar componentes
    Puntuaciones.add(scrollPane);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
        this.dispose();
        UI ui = new UI();
        ui.setSize(1152, 685);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    
        this.dispose();
        UI ui = new UI();
        ui.setSize(1152, 660);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      
        this.dispose();
        UI ui = new UI();
        ui.setSize(1152, 690);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
    
        this.dispose();
        UI ui = new UI();
        ui.setSize(1152, 690);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ActionPerformed
        if(this.problemaService.lessThanFive()){
        this.gato.setPuntaje((int)this.gato.getPuntaje() + (int)Opcion1.getClientProperty("Valor"));
        
        jProgressBar.setValue(gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
           
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion1.putClientProperty("Valor", problema.getOpciones().get(0).getPuntaje());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion2.putClientProperty("Valor", problema.getOpciones().get(1).getPuntaje());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion3.putClientProperty("Valor", problema.getOpciones().get(2).getPuntaje());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        Opcion4.putClientProperty("Valor", problema.getOpciones().get(3).getPuntaje());
        }else{
            JOptionPane.showMessageDialog(null, "Se acabo");
        }
        
        
    }//GEN-LAST:event_Opcion1ActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
         if(this.problemaService.lessThanFive()){
        this.gato.setPuntaje((int)this.gato.getPuntaje() + (int)Opcion2.getClientProperty("Valor"));
        
        jProgressBar.setValue(gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion1.putClientProperty("Valor", problema.getOpciones().get(0).getPuntaje());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion2.putClientProperty("Valor", problema.getOpciones().get(1).getPuntaje());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion3.putClientProperty("Valor", problema.getOpciones().get(2).getPuntaje());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        Opcion4.putClientProperty("Valor", problema.getOpciones().get(3).getPuntaje());
         }else{
            JOptionPane.showMessageDialog(null, "Se acabo");
        }
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ActionPerformed
         if(this.problemaService.lessThanFive()){
        this.gato.setPuntaje((int)this.gato.getPuntaje() + (int)Opcion3.getClientProperty("Valor"));
        
        jProgressBar.setValue(gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion1.putClientProperty("Valor", problema.getOpciones().get(0).getPuntaje());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion2.putClientProperty("Valor", problema.getOpciones().get(1).getPuntaje());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion3.putClientProperty("Valor", problema.getOpciones().get(2).getPuntaje());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        Opcion4.putClientProperty("Valor", problema.getOpciones().get(3).getPuntaje());
         }else{
            JOptionPane.showMessageDialog(null, "Se acabo");
        }
    }//GEN-LAST:event_Opcion3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
         if(this.problemaService.lessThanFive()){
        this.gato.setPuntaje((int)this.gato.getPuntaje() + (int)Opcion4.getClientProperty("Valor"));
        
        jProgressBar.setValue(gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion1.putClientProperty("Valor", problema.getOpciones().get(0).getPuntaje());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion2.putClientProperty("Valor", problema.getOpciones().get(1).getPuntaje());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion3.putClientProperty("Valor", problema.getOpciones().get(2).getPuntaje());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        Opcion4.putClientProperty("Valor", problema.getOpciones().get(3).getPuntaje());
         }else{
            JOptionPane.showMessageDialog(null, "Se acabo");
        }
    }//GEN-LAST:event_Opcion4ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.problemaService = new ProblemaServices();
        MainPanel.removeAll();
        MainPanel.add(Juego);
        MainPanel.repaint();
        MainPanel.revalidate();

        this.gato = Gato.getInstancia();
        
        jProgressBar.setValue(gato.getPuntaje());

        // TODO add your handling code here:

        int id = 0; // ID seleccionado al azar

        Problema problema = problemaService.leerProblema();

        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion1.putClientProperty("Valor", problema.getOpciones().get(0).getPuntaje());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion2.putClientProperty("Valor", problema.getOpciones().get(1).getPuntaje());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion3.putClientProperty("Valor", problema.getOpciones().get(2).getPuntaje());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        Opcion4.putClientProperty("Valor", problema.getOpciones().get(3).getPuntaje());
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Creditos;
    private javax.swing.JPanel IngresarUsuario;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Juego;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Opcion1;
    private javax.swing.JButton Opcion2;
    private javax.swing.JButton Opcion3;
    private javax.swing.JButton Opcion4;
    private javax.swing.JTextArea Problem;
    private javax.swing.JPanel Puntuaciones;
    private javax.swing.JPanel Tutorial;
    private javax.swing.JLabel gatoNormalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
