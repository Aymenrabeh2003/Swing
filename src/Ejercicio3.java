import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JPanel { //la animación se raleantiza, pero si dentro del frame movemos el raton va fluido
    private int y = 100;
    private int x = 0;
    private int deltaX = 1;

    public Ejercicio3() {
        int longitudTexto = getFontMetrics(getFont()).stringWidth("Movimiento Naranja");
        Timer timer = new Timer(30, (ActionEvent e) -> {
            if (x + longitudTexto > getWidth()) {
                x = 0; //aqui si la x + longitudTexto es mayor que el largo del panel (la posición de este volverá a la inicial)
            } else {
                x += deltaX; //sino, seguira sumando posiciones, en este caso si aumenta el movimiento en 2 (Cuanto mayor sea el delta más rapido ira)
            }
            repaint(); // cada comprobación del delay del timer, se repondrá el texto de nuevo
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Movimiento Naranja", x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        Ejercicio3 panel = new Ejercicio3(); //se pone asi porque la clase extiende el JPanel
        frame.add(panel); //en el frame se añade el panel
        frame.setVisible(true);
    }
}
