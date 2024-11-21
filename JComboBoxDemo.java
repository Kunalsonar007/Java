import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JComboBoxDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("JComboBox Demo");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    String[] options = { "Option 1", "Option 2", "Option 3" };
    JComboBox<String> comboBox = new JComboBox<>(options);
    comboBox.setBounds(50, 50, 150, 30);

    JButton button = new JButton("Select");
    button.setBounds(50, 100, 100, 30);

    JLabel label = new JLabel();
    label.setBounds(50, 140, 200, 30);

    frame.add(comboBox);
    frame.add(button);
    frame.add(label);

    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          label.setText("You selected: " + comboBox.getSelectedItem());
        }
      }
    );

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
