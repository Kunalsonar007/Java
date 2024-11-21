import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JTextFieldDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JTextField Demo");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField textField = new JTextField();
    textField.setBounds(50, 50, 150, 30);

    JButton button = new JButton("Show");
    button.setBounds(50, 100, 80, 30);

    JLabel label = new JLabel();
    label.setBounds(50, 140, 200, 30);

    frame.add(textField);
    frame.add(button);
    frame.add(label);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("You entered: " + textField.getText());
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
