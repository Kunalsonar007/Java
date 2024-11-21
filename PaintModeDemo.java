import java.awt.*;
import javax.swing.*;

public class PaintModeDemo extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Normal paint mode
    g.setColor(Color.RED);
    g.fillRect(50, 50, 100, 100);

    // XOR mode
    g.setXORMode(Color.BLUE);
    g.fillRect(100, 100, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Paint Mode Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.add(new PaintModeDemo());
    frame.setVisible(true);
  }
}
