import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JTextAreaDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JTextArea Demo");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea textArea = new JTextArea();
    textArea.setBounds(50, 50, 200, 100);

    JButton button = new JButton("Submit");
    button.setBounds(50, 170, 100, 30);

    JLabel label = new JLabel();
    label.setBounds(50, 210, 300, 30);

    frame.add(textArea);
    frame.add(button);
    frame.add(label);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("You wrote: " + textArea.getText());
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
