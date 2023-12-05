import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class INNValidatorApp extends JFrame {
    private JTextField fullNameField;
    private JTextField innField;
    private JButton validateButton;
    private JLabel resultLabel;

    private static final String[] VALID_INNS = {
            "1234567890",
            "9876543210",
            "5555555555"
    };

    public INNValidatorApp() {
        setTitle("Проверка ИНН");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel fullNameLabel = new JLabel("ФИО:");
        fullNameField = new JTextField();
        JLabel innLabel = new JLabel("ИНН:");
        innField = new JTextField();
        resultLabel = new JLabel("");

        validateButton = new JButton("Проверить");
        validateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fullName = fullNameField.getText();
                    String inn = innField.getText();
                    if (isValidINN(inn)) {
                        throw new Exception("ИНН действителен для " + fullName);
                    } else {
                        throw new Exception("ИНН недействителен");
                    }
                }
                catch(Exception exc) {
                    resultLabel.setText(exc.getMessage());
                }
            }
        });

        panel.add(fullNameLabel);
        panel.add(fullNameField);
        panel.add(innLabel);
        panel.add(innField);
        panel.add(validateButton);
        panel.add(resultLabel);

        add(panel);
    }

    private boolean isValidINN(String inn) {

        for (String validINN : VALID_INNS) {
            if (validINN.equals(inn)) {
                return true;
            }
        }

        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(inn);
        return matcher.matches();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                INNValidatorApp app = new INNValidatorApp();
                app.setVisible(true);
            }
        });
    }
}