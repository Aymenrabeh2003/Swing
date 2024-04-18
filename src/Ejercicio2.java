import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre = "";
        boolean finalText = false;
        while(!finalText){
            if (nombre.equals("Fin")) {
                finalText = true;
            } else {
                nombre = JOptionPane.showInputDialog(null, "Para finalizar escribe Fin.", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

            }
        }
    }
}
