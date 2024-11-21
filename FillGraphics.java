import java.awt.*;
import javax.swing.*;

public class FillGraphics extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Filled Rectangle
    g.setColor(Color.RED);
    g.fillRect(50, 50, 150, 100);

    // Filled Oval
    g.setColor(Color.BLUE);
    g.fillOval(250, 50, 150, 100);

    // Filled Arc
    g.setColor(Color.GREEN);
    g.fillArc(50, 200, 150, 100, 0, 180);

    // Filled Circle
    g.setColor(Color.ORANGE);
    g.fillOval(250, 200, 100, 100);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Filled Shapes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.add(new FillGraphics());
    frame.setVisible(true);
  }
}
