import javax.swing.*;
import java.awt.*;


public class PONG extends JFrame {
    private final static int WIDTH = 750, HEIGHT = 550;
    private PONGpanel panel;

    //title,color, change how big the screen is, etc.
    public PONG() {
        setSize(WIDTH,HEIGHT);
        setTitle("PONG");
        setBackground(Color.WHITE);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new PONGpanel(this);
        add(panel);
    }
// links to PONGpanel
    public PONGpanel getPanel() {
        return panel;
    }
    public static void main(String[] args) {
        new PONG();
    }
}
