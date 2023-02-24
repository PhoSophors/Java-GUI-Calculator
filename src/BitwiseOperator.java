/**
 * Bitwise Operator
 * date: Tuesday, 24 July 2022
 * name : Pho Sophors
 */

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class BitwiseOperator {

    public static final String BITWISE = "Bitwise Operator"; // bitwise operator

    public JPanel bitwisePanel;
    int numBitwise1, numBitwise2, resultBitwise;
    String operationBitwise = "";

    private void bitwiseDesign (){
        // create panel
        JPanel slider = new JPanel();
        JPanel panelTextField = new JPanel();
        JPanel panelButton = new JPanel(new GridLayout(3,6,1,1));

        // adding slider to bitwisePanel
        bitwisePanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("BITWISE OPERATOR");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        // adding panelTextField to arithmeticPanel and setSize
        bitwisePanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(600, 100));
        panelTextField.setBackground(Color.white);

        // adding panelButton to bitwisePanel and setSize
        bitwisePanel.add(panelButton);
        panelButton.setPreferredSize(new Dimension(600, 260));
        panelButton.setBackground(Color.pink);

        /*---- create history textField */
        JTextField history = new JTextField();
        history.setPreferredSize(new Dimension(600, 30));
        Font fontHistory = new Font("SansSerif", Font.PLAIN, 20);
        history.setForeground(Color.gray);
        history.setFont(fontHistory);
        history.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        history.setEditable(false);
        panelTextField.add(history);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(600, 60));
        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */

        /*------------------------------------------------------------*/
        // create button
        JButton button0 = new JButton("0");
        button0.addActionListener(e -> {
            String number = textField.getText() + button0.getText();
            textField.setText(number);
            String number1 = history.getText() + button0.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button1 = new JButton("1");
        button1.addActionListener(e -> {
            String number = textField.getText() + button1.getText();
            textField.setText(number);
            String number1 = history.getText() + button1.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button2 = new JButton("2");
        button2.addActionListener(e -> {
            String number = textField.getText() + button2.getText();
            textField.setText(number);
            String number1 = history.getText() + button2.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button3 = new JButton("3");
        button3.addActionListener(e -> {
            String number = textField.getText() + button3.getText();
            textField.setText(number);
            String number1 = history.getText() + button3.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> {
            String number = textField.getText() + button4.getText();
            textField.setText(number);
            String number1 = history.getText() + button4.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> {
            String number = textField.getText() + button5.getText();
            textField.setText(number);
            String number1 = history.getText() + button5.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {
            String number = textField.getText() + button6.getText();
            textField.setText(number);
            String number1 = history.getText() + button6.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
            String number1 = history.getText() + button7.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {
            String number = textField.getText() + button8.getText();
            textField.setText(number);
            String number1 = history.getText() + button8.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
            textField.setText(number);
            String number1 = history.getText() + button9.getText();
            history.setText(number1);
        });
        /*------------------------------------------------------------*/
        /* and operator */
        JButton and = new JButton("&");
        and.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = "&";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        }); /* end and operator */
        /*------------------------------------------------------------*/
        /* or operator */
        JButton or = new JButton("|");
        or.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = "|";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        });
        /* end or operator */
        /*------------------------------------------------------------*/
        /* xor operator */
        JButton xor = new JButton("^");
        xor.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = "^";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        });
        /* end xor operator */
        /*------------------------------------------------------------*/
        /* leftShift operator */
        JButton leftShift = new JButton("<<");
        leftShift.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = "<<";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        });
        /* end leftShift operator */
        /*------------------------------------------------------------*/
        /* rightShift operator */
        JButton rightShift = new JButton(">>");
        rightShift.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = ">>";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        });
        /* end rightShift operator */
        /*------------------------------------------------------------*/
        /* inversion operator */
        JButton inversion = new JButton("~");
        inversion.addActionListener(e -> {
            numBitwise1 = (int) Double.parseDouble(textField.getText());
            operationBitwise = "~";
            textField.setText("");
            history.setText(history.getText() + operationBitwise + textField.getText());
        });
        /* end inversion operator */
        /*------------------------------------------------------------*/
        /* ac */
        JButton ac = new JButton("C");
        ac.addActionListener(e -> textField.setText(""));
        ac.addActionListener(e -> history.setText("")); /* end ac */
        /*------------------------------------------------------------*/
        /* equal*/
        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            numBitwise2 = (int) Double.parseDouble(textField.getText());
            if(Objects.equals(operationBitwise, "&")) {
                resultBitwise = numBitwise1 & numBitwise2;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operationBitwise, "|")) {
                resultBitwise = numBitwise1 | numBitwise2;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operationBitwise, "^")) {
                resultBitwise = numBitwise1 ^ numBitwise2;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operationBitwise, "<<")) {
                resultBitwise = numBitwise1 << numBitwise2;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operationBitwise, ">>")) {
                resultBitwise = numBitwise1 >> numBitwise2;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operationBitwise, "~")) {
                resultBitwise = ~ numBitwise1;
                textField.setText("" + resultBitwise);
                history.setText("" + history.getText());
            }
        }); /* END equal*/
        /* /*-----------------------------*/ /*-----------------------------*/ /*-----------------------------*/

        /* Set Font Size in a JButton */
        button7.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button8.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button9.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button4.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button5.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button6.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button1.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button2.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button3.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button0.setFont(new Font("SansSerif", Font.PLAIN, 20));
        equal.setFont(new Font("SansSerif", Font.PLAIN, 20));
        and.setFont(new Font("SansSerif", Font.PLAIN, 20));
        or.setFont(new Font("SansSerif", Font.PLAIN, 20));
        xor.setFont(new Font("SansSerif", Font.PLAIN, 20));
        leftShift.setFont(new Font("SansSerif", Font.PLAIN, 20));
        rightShift.setFont(new Font("SansSerif", Font.PLAIN, 20));
        inversion.setFont(new Font("SansSerif", Font.PLAIN, 20));
        ac.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /* END Set Font Size in a JButton */

        /*-----------------------------*/
        panelButton.add(and);
        panelButton.add(or);
        panelButton.add(button7);
        panelButton.add(button8);
        panelButton.add(button9);
        panelButton.add(ac);
        /*-----------------------------*/
        panelButton.add(xor);
        panelButton.add(inversion);
        panelButton.add(button4);
        panelButton.add(button5);
        panelButton.add(button6);
        panelButton.add(button0);
        /*-----------------------------*/
        panelButton.add(leftShift);
        panelButton.add(rightShift);
        panelButton.add(button1);
        panelButton.add(button2);
        panelButton.add(button3);
        panelButton.add(equal);

    } // end bitwiseDesign
    //    ====================== End bitwise ========================  //

    // create Bitwise operator
    public BitwiseOperator(){
        bitwisePanel = new JPanel();
        bitwisePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        bitwiseDesign();
    } // -- end bitwise operator --
}
