import javax.swing.*;

public class RadioButtonDemo {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Radio Button Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    JRadioButton rb1 = new JRadioButton("Option 1");
    JRadioButton rb2 = new JRadioButton("Option 2");
    JRadioButton rb3 = new JRadioButton("Option 3");

    ButtonGroup group = new ButtonGroup();
    group.add(rb1);
    group.add(rb2);
    group.add(rb3);

    rb1.setBounds(50, 50, 100, 30);
    rb2.setBounds(150, 50, 100, 30);
    rb3.setBounds(250, 50, 100, 30);

    JLabel label = new JLabel("Select an option");
    label.setBounds(50, 100, 200, 30);

    frame.add(rb1);
    frame.add(rb2);
    frame.add(rb3);
    frame.add(label);

    rb1.addActionListener(e -> label.setText("Option 1 selected"));
    rb2.addActionListener(e -> label.setText("Option 2 selected"));
    rb3.addActionListener(e -> label.setText("Option 3 selected"));

    frame.setLayout(null);
    frame.setVisible(true);
  }
}
