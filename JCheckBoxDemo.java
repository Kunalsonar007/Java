import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JCheckBoxDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JCheckBox Demo");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JCheckBox checkBox1 = new JCheckBox("Option 1");
    checkBox1.setBounds(50, 50, 100, 30);

    JCheckBox checkBox2 = new JCheckBox("Option 2");
    checkBox2.setBounds(50, 90, 100, 30);

    JButton button = new JButton("Submit");
    button.setBounds(50, 130, 100, 30);

    frame.add(checkBox1);
    frame.add(checkBox2);
    frame.add(button);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          String message = "Selected: ";
          if (checkBox1.isSelected()) message += "Option 1 ";
          if (checkBox2.isSelected()) message += "Option 2 ";
          JOptionPane.showMessageDialog(frame, message);
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
