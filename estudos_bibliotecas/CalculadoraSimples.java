import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples extends JFrame implements ActionListener {
    private JTextField textField1, textField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public CalculadoraSimples() {
        // Configurações da janela
        setTitle("Calculadora Simples");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campos de entrada
        textField1 = new JTextField();
        textField1.setBounds(50, 20, 100, 30);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(200, 20, 100, 30);
        add(textField2);

        // Campo de resultado
        resultField = new JTextField();
        resultField.setBounds(50, 120, 250, 30);
        resultField.setEditable(false);
        add(resultField);

        // Botões de operações
        addButton = new JButton("+");
        addButton.setBounds(50, 70, 50, 30);
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("-");
        subtractButton.setBounds(110, 70, 50, 30);
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.setBounds(170, 70, 50, 30);
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.setBounds(230, 70, 50, 30);
        divideButton.addActionListener(this);
        add(divideButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Erro: Divisão por zero");
                    return;
                }
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Erro: Entrada inválida");
        }
    }

    public static void main(String[] args) {
        CalculadoraSimples calc = new CalculadoraSimples();
        calc.setVisible(true);
    }
}
