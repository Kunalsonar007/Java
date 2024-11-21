import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JPasswordFieldDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JPasswordField Demo");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Password:");
    label.setBounds(50, 50, 100, 30);

    JPasswordField passwordField = new JPasswordField();
    passwordField.setBounds(150, 50, 100, 30);

    JButton button = new JButton("Login");
    button.setBounds(100, 100, 80, 30);

    frame.add(label);
    frame.add(passwordField);
    frame.add(button);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String password = new String(passwordField.getPassword());
          JOptionPane.showMessageDialog(frame, "Password entered: " + password);
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
