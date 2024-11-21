import java.awt.*;
import javax.swing.*;

public class SmileyFace extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Face
    g.setColor(Color.YELLOW);
    g.fillOval(50, 50, 200, 200);

    // Eyes
    g.setColor(Color.BLACK);
    g.fillOval(90, 100, 30, 30);
    g.fillOval(180, 100, 30, 30);

    // Mouth
    g.drawArc(90, 140, 120, 60, 0, -180);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Smiley Face");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.add(new SmileyFace());
    frame.setVisible(true);
  }
}
