package main;

import interfaz.UI;

public class Main {
   public static void main(String[] args) {
    System.out.println("Iniciando la aplicación..."); // Mensaje de prueba
    java.awt.EventQueue.invokeLater(() -> {
        UI ui = new UI();
        ui.setSize(800, 600);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
        System.out.println("Ventana UI debería estar visible ahora"); // Mensaje de prueba
    });
    }
}
