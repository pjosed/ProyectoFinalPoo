package main;

import interfaz.UI;

public class Main {
   public static void main(String[] args) {
    
    java.awt.EventQueue.invokeLater(() -> {
        UI ui = new UI();
        ui.setSize(1152, 690);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
        
    });
    }
}
