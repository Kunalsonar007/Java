import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Calculator");
    frame.setSize(400, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Input fields and result
    JTextField textField1 = new JTextField();
    textField1.setBounds(50, 50, 130, 40);
    JTextField textField2 = new JTextField();
    textField2.setBounds(200, 50, 130, 40);
    JLabel resultLabel = new JLabel("Result: ");
    resultLabel.setBounds(50, 110, 200, 40);

    // Buttons for operations
    JButton addButton = new JButton("+");
    addButton.setBounds(50, 180, 60, 40);
    JButton subtractButton = new JButton("-");
    subtractButton.setBounds(130, 180, 60, 40);
    JButton multiplyButton = new JButton("*");
    multiplyButton.setBounds(210, 180, 60, 40);
    JButton divideButton = new JButton("/");
    divideButton.setBounds(290, 180, 60, 40);

    // Add action listeners to buttons
    ActionListener operationListener = e -> {
      try {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double result;

        if (e.getSource() == addButton) {
          result = num1 + num2;
          resultLabel.setText("Result: " + result);
        } else if (e.getSource() == subtractButton) {
          result = num1 - num2;
          resultLabel.setText("Result: " + result);
        } else if (e.getSource() == multiplyButton) {
          result = num1 * num2;
          resultLabel.setText("Result: " + result);
        } else if (e.getSource() == divideButton) {
          if (num2 == 0) {
            JOptionPane.showMessageDialog(
              frame,
              "Division by zero is not allowed!"
            );
          } else {
            result = num1 / num2;
            resultLabel.setText("Result: " + result);
          }
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
      }
    };

    addButton.addActionListener(operationListener);
    subtractButton.addActionListener(operationListener);
    multiplyButton.addActionListener(operationListener);
    divideButton.addActionListener(operationListener);

    // Add components to frame
    frame.setLayout(null);
    frame.add(textField1);
    frame.add(textField2);
    frame.add(resultLabel);
    frame.add(addButton);
    frame.add(subtractButton);
    frame.add(multiplyButton);
    frame.add(divideButton);

    frame.setVisible(true);
  }
}
