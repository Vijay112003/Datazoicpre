
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Twopoint {

    private JFrame frame;
    private JTextField arrayField;
    private JTextField targetField;
    private JTextArea resultArea;

    public Twopoint() {
        frame = new JFrame("Two Point Sum Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        arrayField = new JTextField();
        targetField = new JTextField();
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        JButton findButton = new JButton("Find Combinations");
        findButton.addActionListener((ActionEvent e) -> {
            String[] arrayStr = arrayField.getText().split(",");
            int[] arr = new int[arrayStr.length];
            for (int i = 0; i < arrayStr.length; i++) {
                arr[i] = Integer.parseInt(arrayStr[i].trim());
            }
            int target = Integer.parseInt(targetField.getText().trim());

            List<Integer> result = new ArrayList<>();
            findCombinations(arr, target, 0, new ArrayList<>(), result);

            if (result.isEmpty()) {
                resultArea.setText("No combination of numbers adds up to the target sum.");
            } else {
                resultArea.setText(result.toString());
            }
        });

        frame.add(new JLabel("Enter the elements of the array (comma separated):"));
        frame.add(arrayField);
        frame.add(new JLabel("Enter the target sum:"));
        frame.add(targetField);
        frame.add(findButton);
        frame.add(new JScrollPane(resultArea));

        frame.setVisible(true);
    }

    private void findCombinations(int[] arr, int target, int start, List<Integer> current, List<Integer> result) {
        if (target == 0) {
            if (result.isEmpty() || current.size() < result.size()) {
                result.clear();
                result.addAll(current);
            }
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            findCombinations(arr, target - arr[i], i, current, result); // Allow repeating values by passing 'i' instead of 'i + 1'
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Twopoint();
            }
        });
    }
}
