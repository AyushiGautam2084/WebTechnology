import javax.swing.*;
import java.awt.event.*;

public class Q6assgn extends JFrame {
    private JTextField celsiusField, fahrenheitField;
    private JButton celsiusToFahrenheitButton, fahrenheitToCelsiusButton;

    public Q6assgn() {
        super("Temperature Converter");

        // create the Celsius text field
        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField(10);

        // create the Fahrenheit text field
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField(10);

        // create the Celsius to Fahrenheit button
        celsiusToFahrenheitButton = new JButton("Celsius to Fahrenheit");
        celsiusToFahrenheitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                fahrenheitField.setText(String.format("%.2f", fahrenheit));
            }
        });

        // create the Fahrenheit to Celsius button
        fahrenheitToCelsiusButton = new JButton("Fahrenheit to Celsius");
        fahrenheitToCelsiusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5/9;
                celsiusField.setText(String.format("%.2f", celsius));
            }
        });

        // add the components to the frame
        JPanel panel = new JPanel();
        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(celsiusToFahrenheitButton);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);
        panel.add(fahrenheitToCelsiusButton);
        add(panel);

        // configure the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q6assgn();
            }
        });
    }
}
