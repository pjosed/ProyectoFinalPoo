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
        Juego = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Opcion1 = new javax.swing.JButton();
        Opcion2 = new javax.swing.JButton();
        Opcion3 = new javax.swing.JButton();
        Opcion4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        gatoNormalLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanelPuntaje = new javax.swing.JPanel();
        labelPuntaje = new java.awt.Label();
        jScrollPane4 = new javax.swing.JScrollPane();
        Problem = new javax.swing.JTextArea();
        Puntuaciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        Creditos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jButton8 = new javax.swing.JButton();
        Tutorial = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        IngresarUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        jButton10 = new javax.swing.JButton();
        Inicio = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        MainPanel.setLayout(new java.awt.CardLayout());

        Juego.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));

        Opcion1.setText("Opcion1");
        Opcion1.setToolTipText("");
        Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ActionPerformed(evt);
            }
        });

        Opcion2.setText("Opcion2");
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });

        Opcion3.setText("Opcion3");
        Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ActionPerformed(evt);
            }
        });

        Opcion4.setText("Opcion4");
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(Opcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gatoNormalLabel.setText("Gatoo");
        jPanel3.add(gatoNormalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 70, 40));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 28, -1, -1));

        labelPuntaje.setText("Vida del Gato");

        javax.swing.GroupLayout jPanelPuntajeLayout = new javax.swing.GroupLayout(jPanelPuntaje);
        jPanelPuntaje.setLayout(jPanelPuntajeLayout);
        jPanelPuntajeLayout.setHorizontalGroup(
            jPanelPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPuntajeLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(labelPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanelPuntajeLayout.setVerticalGroup(
            jPanelPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPuntajeLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanelPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 6, -1, 40));

        Problem.setEditable(false);
        Problem.setColumns(10);
        Problem.setLineWrap(true);
        Problem.setRows(5);
        Problem.setWrapStyleWord(true);
        jScrollPane4.setViewportView(Problem);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 260, 100));

        javax.swing.GroupLayout JuegoLayout = new javax.swing.GroupLayout(Juego);
        Juego.setLayout(JuegoLayout);
        JuegoLayout.setHorizontalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)))
        );
        JuegoLayout.setVerticalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(Juego, "card2");

        Puntuaciones.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel4.setText("Ranking");

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

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PuntuacionesLayout = new javax.swing.GroupLayout(Puntuaciones);
        Puntuaciones.setLayout(PuntuacionesLayout);
        PuntuacionesLayout.setHorizontalGroup(
            PuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuntuacionesLayout.createSequentialGroup()
                .addGroup(PuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PuntuacionesLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel4))
                    .addGroup(PuntuacionesLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PuntuacionesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton7)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        PuntuacionesLayout.setVerticalGroup(
            PuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuntuacionesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton7)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        MainPanel.add(Puntuaciones, "card2");

        Creditos.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setText("Credits");

        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea1.setEditable(false);
        textArea1.setEnabled(false);
        textArea1.setText("Ana Meza\nAlexander Rangel\nAlejandro Cuello\nJulian Castro\nJose Peña");

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditosLayout = new javax.swing.GroupLayout(Creditos);
        Creditos.setLayout(CreditosLayout);
        CreditosLayout.setHorizontalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditosLayout.createSequentialGroup()
                .addGroup(CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreditosLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel5))
                    .addGroup(CreditosLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreditosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton8)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        CreditosLayout.setVerticalGroup(
            CreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton8)
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        MainPanel.add(Creditos, "card2");

        Tutorial.setPreferredSize(new java.awt.Dimension(800, 600));

        label3.setText("Tutorial");

        jButton6.setText("Escuchar");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial\nTutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial Tutorial");
        jScrollPane1.setViewportView(jTextArea1);

        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TutorialLayout = new javax.swing.GroupLayout(Tutorial);
        Tutorial.setLayout(TutorialLayout);
        TutorialLayout.setHorizontalGroup(
            TutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorialLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TutorialLayout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TutorialLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(82, 82, 82))
        );
        TutorialLayout.setVerticalGroup(
            TutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorialLayout.createSequentialGroup()
                .addGroup(TutorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TutorialLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton6))
                    .addGroup(TutorialLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton9)))
                .addGap(32, 32, 32)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );

        MainPanel.add(Tutorial, "card2");

        IngresarUsuario.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setText("Ingresa Tu Usuario");

        textField1.setText("textField1");

        button1.setLabel("Iniciar Juego");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarUsuarioLayout = new javax.swing.GroupLayout(IngresarUsuario);
        IngresarUsuario.setLayout(IngresarUsuarioLayout);
        IngresarUsuarioLayout.setHorizontalGroup(
            IngresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarUsuarioLayout.createSequentialGroup()
                .addGroup(IngresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresarUsuarioLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addGroup(IngresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(IngresarUsuarioLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton10)))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        IngresarUsuarioLayout.setVerticalGroup(
            IngresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarUsuarioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton10)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        MainPanel.add(IngresarUsuario, "card2");

        Inicio.setPreferredSize(new java.awt.Dimension(800, 600));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("Inicio");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tutorial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Creditos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Puntuacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(396, 396, 396))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.add(Inicio, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.problemaService = new ProblemaServices(); 
        MainPanel.removeAll();
        MainPanel.add(Juego);
        MainPanel.repaint();
        MainPanel.revalidate();     // TODO add your handling code here:

        this.gato = Gato.getInstancia();
        labelPuntaje.setText("Puntaje: " + gato.getPuntaje());
        
        Problema problema = problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
        
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
    java.awt.EventQueue.invokeLater(() -> {
        this.dispose();
        UI ui = new UI();
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba
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
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
    
        this.dispose();
        UI ui = new UI();
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
        this.dispose();
        UI ui = new UI();
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba         // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
    
        this.dispose();
        UI ui = new UI();
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba         // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ActionPerformed
        labelPuntaje.setText("Puntaje: " + this.gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
    }//GEN-LAST:event_Opcion1ActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
     labelPuntaje.setText("Puntaje: " + this.gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ActionPerformed
    labelPuntaje.setText("Puntaje: " + this.gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
    }//GEN-LAST:event_Opcion3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
   labelPuntaje.setText("Puntaje: " + this.gato.getPuntaje());
        
        Problema problema = this.problemaService.leerProblema();
        
        Problem.setText(problema.getTextoProblema());
        Opcion1.setText(problema.getOpciones().get(0).getDescripcion());
        Opcion2.setText(problema.getOpciones().get(1).getDescripcion());
        Opcion3.setText(problema.getOpciones().get(2).getDescripcion());
        Opcion4.setText(problema.getOpciones().get(3).getDescripcion());
    }//GEN-LAST:event_Opcion4ActionPerformed


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
    private java.awt.Button button1;
    private javax.swing.JLabel gatoNormalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPuntaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label labelPuntaje;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
