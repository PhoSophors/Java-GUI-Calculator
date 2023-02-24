import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class BinaryArithmetic {

    public static final String BINARY = "Binary Arithmetic";
    JPanel binaryArithmeticPanel;
    int result;
    String operation = "";
    int a1;
    long a2;
    String a ;
    String b;

    private void binaryArithmeticDesign () {

      // create panel
        JPanel slider = new JPanel();
        JPanel panelTextField = new JPanel();
        JPanel panelButton = new JPanel(new GridLayout(2,4,1,1));

        // adding slider to arithmeticPanel
        binaryArithmeticPanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("ARITHMETIC AND TRIGONOMETRY");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        // adding panelTextField to arithmeticPanel and setSize
        binaryArithmeticPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(600, 70));

        // adding panelButton to arithmeticPanel and setSize
        binaryArithmeticPanel.add(panelButton);
        panelButton.setPreferredSize(new Dimension(600, 290));
        panelButton.setBackground(Color.lightGray);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(600, 65));
        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */


        /*------------------------------------------------------------*/
        // create button

        JButton button0 = new JButton("0");
        button0.addActionListener(e -> {
            String number = textField.getText() +button0.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button1 = new JButton("1");
        button1.addActionListener(e -> {
            String number = textField.getText() + button1.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        /* ac */
        JButton ac = new JButton("C");
        ac.addActionListener(e -> textField.setText(""));
//        ac.addActionListener(e -> textArea.setText(""));/* end ac */
        /*------------------------------------------------------------*/
        /* multiply*/
        JButton multiply = new JButton("x");
        multiply.addActionListener(e -> {
            a1 = (int) Double.parseDouble(textField.getText());
            operation = "*";
            textField.setText("");
        }); /* end multiply*/
        /*------------------------------------------------------------*/
        /* end minus */
        JButton minus = new JButton("-");
        minus.addActionListener(e -> {
            a1 = (int) Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
        }); /* end minus */
        /*------------------------------------------------------------*/
        /* subtract */
        JButton subtract = new JButton("+");
        subtract.addActionListener(e -> {
            a1 = (int) Double.parseDouble(textField.getText());
            operation = "+";
            textField.setText("");
        }); /* end subtract */
        /*------------------------------------------------------------*/
        /* mod */
        JButton division = new JButton("/");
        division.addActionListener(e -> {
            a1 = (int) Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
        });  /* end mod */

        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            a1 = (int) Double.parseDouble(textField.getText());
            if (operation == "+") {
                result = BinaryArithmeticCalculate.binaryAdd(a1, a2);
                textField.setText("" + result);
            }

        });

        panelButton.add(ac);
        panelButton.add(button1);
        panelButton.add(button0);
        panelButton.add(equal);
        panelButton.add(subtract);
        panelButton.add(minus);
        panelButton.add(division);
        panelButton.add(multiply);

    }

    public BinaryArithmetic (){

        binaryArithmeticPanel = new JPanel();
        binaryArithmeticPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//        binaryArithmeticPanel.setBackground(Color.cyan);

        binaryArithmeticDesign();
    }
    //    ====================== End binary arithmetic ========================  //
}
