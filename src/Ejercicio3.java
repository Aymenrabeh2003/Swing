import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Animación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.add(frame);
        panel.setSize(300,200);

        JTextArea texto = new JTextArea("Movimiento Naranja");

        
    }
}
