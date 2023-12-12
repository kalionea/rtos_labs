import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorApp extends JFrame {
    private JTextArea display;

    public CalculatorApp() {

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextArea();
        display.setEditable(true);
        add(display, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));


        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };


        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {

                try {
                    String expression = display.getText();
                    double result = evaluateExpression(expression);
                    display.setText(Double.toString(result));
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else {
                var isNumber = isNumeric(buttonText) || display.getText() == "";

                if (isNumber) {
                    var currentNumber = getLastNumber(display.getText());
                    if (currentNumber.length() > 6) {
                        return;
                    }
                }
                display.append((isNumber ? "" : " ") + buttonText + (isNumber ? "" : " "));
            }
        }

        private double evaluateExpression(String expression) {
            String[] tokens = expression.split(" ");
            double operand1;
            double operand2;
            String operator;
            if (tokens[0].equals("-")) {
                operand1 = Double.parseDouble(tokens[1])*-1;
                operand2 = Double.parseDouble(tokens[3]);
                operator = tokens[2];
            }else{
                operand1 = Double.parseDouble(tokens[0]);
                operand2 = Double.parseDouble(tokens[2]);
                operator = tokens[1];
            }

            switch (operator) {
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    if (operand2 != 0) {
                        return operand1 / operand2;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        public static boolean isNumeric(String str) {
            return str.matches("-?\\d+(\\.\\d+)?");
        }

        public static String getLastNumber(String input) {
            Pattern pattern = Pattern.compile("\\d+$");
            Matcher matcher = pattern.matcher(input);

            String lastNumber = "";
            while (matcher.find()) {
                lastNumber = matcher.group();
            }

            return lastNumber;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorApp().setVisible(true);
        });
    }
}