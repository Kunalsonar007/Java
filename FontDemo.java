import java.awt.*;
import javax.swing.*;

public class FontDemo extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setFont(new Font("Serif", Font.PLAIN, 20));
    g.drawString("This is Serif Plain", 50, 50);

    g.setFont(new Font("SansSerif", Font.BOLD, 24));
    g.drawString("This is SansSerif Bold", 50, 100);

    g.setFont(new Font("Monospaced", Font.ITALIC, 28));
    g.drawString("This is Monospaced Italic", 50, 150);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Font Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 300);
    frame.add(new FontDemo());
    frame.setVisible(true);
  }
}
