import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        JFrame ventanaPrincipal = new JFrame("Principal");
        JFrame ventanaSecundaria = new JFrame("Secundaria");

        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventanaPrincipal.setVisible(true);
        ventanaSecundaria.setVisible(true);

        ventanaPrincipal.setSize(300,300);
        ventanaSecundaria.setSize(300,300);

    }
}
