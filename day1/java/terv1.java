import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Terv1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel num1Label = new JLabel("Num1:");
        num1Label.setBounds(10, 20, 80, 25);
        panel.add(num1Label);

        JTextField num1Text = new JTextField(20);
        num1Text.setBounds(100, 20, 165, 25);
        panel.add(num1Text);

        JLabel num2Label = new JLabel("Num2:");
        num2Label.setBounds(10, 50, 80, 25);
        panel.add(num2Label);

        JTextField num2Text = new JTextField(20);
        num2Text.setBounds(100, 50, 165, 25);
        panel.add(num2Text);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 80, 80, 25);
        panel.add(resultLabel);

        JTextField resultText = new JTextField(20);
        resultText.setBounds(100, 80, 165, 25);
        resultText.setEditable(false);
        panel.add(resultText);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(10, 110, 80, 25);
        panel.add(divideButton);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Text.getText());
                    int num2 = Integer.parseInt(num2Text.getText());
                    int result = num1 / num2;
                    resultText.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Please enter valid integers.", "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(panel, "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}