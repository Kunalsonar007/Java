import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JButtonDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JButton Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    JButton button = new JButton("Click Me");
    button.setBounds(100, 50, 100, 50);

    JLabel label = new JLabel("Hello, World!");
    label.setBounds(100, 120, 150, 30);

    frame.add(button);
    frame.add(label);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("Button Clicked!");
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
