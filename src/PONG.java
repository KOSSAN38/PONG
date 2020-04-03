import java.awt.Color;
import javax.swing.*;


public class PONG extends JFrame {
    private final static int WIDTH = 700, HEIGHT = 450;
    private PONGpanel panel;

    public PONG() {
        setSize(WIDTH,HEIGHT);
        setTitle("PONG");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new PONGpanel(this);
        add(panel);
    }

    public PONGpanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new PONG();
    }
}
