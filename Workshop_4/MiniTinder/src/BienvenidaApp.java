import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BienvenidaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bienvenida");
        JLabel label = new JLabel("Bienvenidos", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Cambia el tamaño y estilo de la fuente
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }
}