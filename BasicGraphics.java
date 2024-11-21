import java.awt.*;
import javax.swing.*;

public class BasicGraphics extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Line
    g.drawLine(50, 50, 200, 50);

    // Circle
    g.drawOval(50, 100, 100, 100);

    // Arc
    g.drawArc(200, 100, 100, 100, 0, 180);

    // Rectangle
    g.drawRect(50, 250, 150, 100);

    // Oval
    g.drawOval(250, 250, 150, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Basic Graphics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.add(new BasicGraphics());
    frame.setVisible(true);
  }
}
