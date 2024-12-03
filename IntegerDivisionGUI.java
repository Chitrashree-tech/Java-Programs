import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionGUI {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Integer Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        
        JLabel label1 = new JLabel("Num1:");
        JLabel label2 = new JLabel("Num2:");
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton divideButton = new JButton("Divide");
        JLabel resultLabel = new JLabel("Result: ");

        
        frame.setLayout(new FlowLayout());
        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(resultLabel);

        
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero");
                    }

                    int result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        frame.setVisible(true);
    }
}
