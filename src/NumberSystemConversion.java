import javax.swing.*;
import java.awt.*;

public class NumberSystemConversion {
    JPanel binPanel = new JPanel();
    JPanel octPanel = new JPanel();
    JPanel decPanel = new JPanel();
    JPanel hexPanel = new JPanel();

    public static final String NUMBER = "Number System"; // number system conversion
    JPanel numberSystemPanel;

    private void tabs() {

        JPanel frameTabs = new JPanel(); // create the frame for tab
        JPanel slider = new JPanel();

        /*--------------------------------------------------------------*/
        // adding slider to arithmeticPanel
        numberSystemPanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("STORAGE CONVERTER");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        //Create the tab container
        JTabbedPane tabs = new JTabbedPane();
        tabs.setPreferredSize(new Dimension(620, 380));
        //Associate each panel with the corresponding tab
        tabs.add("Binary convert to other number", binPanel);
        tabs.add("Octal convert to other number)", octPanel);
        tabs.add("Decimal convert to other number)", decPanel);
        tabs.add("Hexadecimal convert to other number)", hexPanel);

        //Add tabs to the frame
        frameTabs.add(tabs);
        frameTabs.setPreferredSize(new Dimension(600, 410));

        // add frameTabs to moneyExchange
        numberSystemPanel.add(frameTabs);
    }
    /*--------------------------------------------------------------*/

    public void binConvert () {
        /* ------------------- Riel to other Currencies ------------------- */
        // create panel for rielButtonPanel and rielTextFieldPanel
        JPanel ButtonPanel = new JPanel();
        JPanel TextFieldPanel = new JPanel();

        // set new Dimension ButtonPanel and TextFieldPanel
        ButtonPanel.setPreferredSize(new Dimension(270, 320));
        TextFieldPanel.setPreferredSize(new Dimension(315, 320));

        ButtonPanel.setBackground(Color.pink);
        TextFieldPanel.setBackground(Color.pink);

        // add rielButtonPanel and TextFieldPanel to Panel
        binPanel.add(ButtonPanel);
        binPanel.add(TextFieldPanel);

        // ----------------- textField
        JPanel panelTextField = new JPanel();
        ButtonPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(250, 70));
        panelTextField.setBackground(Color.pink);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 65));

        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */
        // -----------------
        // ----------------- textArea
        JTextArea textArea = new JTextArea();
        TextFieldPanel.add(textArea );
        textArea.setPreferredSize(new Dimension(300, 300));

        Font font2 = new Font("SansSerif", Font.PLAIN, 18); /* create font and size in textField */
        textArea.setFont(font2); /* add font to textField */
        textArea.setEditable(false);
        // -----------------
        // ----------------- button
        JPanel buttonPanel1 = new JPanel(new GridLayout(2,2, 10, 10));
        buttonPanel1.setPreferredSize(new Dimension(250, 100));
        ButtonPanel.add(buttonPanel1);
        buttonPanel1.setBackground(Color.lightGray);
        // -----------------

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
        ac.addActionListener(e -> textArea.setText(""));/* end ac */

        JButton convert = new JButton("Convert");
        /* actionPerformed */
        convert.addActionListener(e -> {
            int numMoney1;

            numMoney1 = Integer.parseInt(textField.getText());

            int bin2Dec = NumberSystemConversionCalculate.binary2Decimal(numMoney1);
            int bin2Oct = NumberSystemConversionCalculate.binary2Octal(numMoney1);
            float bin2Hex = NumberSystemConversionCalculate.binary2Hex(numMoney1);

            textArea.setText(textArea.getText()
                    + " Decimal = " + bin2Dec + "\n"
                    + " Octal = " + bin2Oct + "\n"
                    + " Hexadecimal = " + bin2Hex + "\n"


            ); /* ----- end  textArea.setText(textArea.getText() ---------*/
        }); /* end equal */

        buttonPanel1.add(button1);
        buttonPanel1.add(button0);
        buttonPanel1.add(ac);
        buttonPanel1.add(convert);
    } /*----- end byte convert ------*/

    /*======================== octal convert ======================== */
    public void octConvert () {
        /* ------------------- Riel to other Currencies ------------------- */
        // create panel for rielButtonPanel and rielTextFieldPanel
        JPanel rielButtonPanel = new JPanel();
        JPanel rielTextFieldPanel = new JPanel();

        // set new Dimension rielButtonPanel and rielTextFieldPanel
        rielButtonPanel.setPreferredSize(new Dimension(270, 320));
        rielTextFieldPanel.setPreferredSize(new Dimension(315, 320));

        rielButtonPanel.setBackground(Color.pink);
        rielTextFieldPanel.setBackground(Color.pink);

        // add rielButtonPanel and rielTextFieldPanel to rielPanel
        octPanel.add(rielButtonPanel);
        octPanel.add(rielTextFieldPanel);

        // ----------------- textField
        JPanel panelTextField = new JPanel();
        rielButtonPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(250, 70));
        panelTextField.setBackground(Color.pink);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 65));

        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */
        // -----------------
        // ----------------- textArea
        JTextArea textArea = new JTextArea();
        rielTextFieldPanel.add(textArea );
        textArea.setPreferredSize(new Dimension(300, 300));

        Font font2 = new Font("SansSerif", Font.PLAIN, 18); /* create font and size in textField */
        textArea.setFont(font2); /* add font to textField */
        textArea.setEditable(false);
        // -----------------
        // ----------------- button
        JPanel buttonPanel1 = new JPanel(new GridLayout(4,3, 10, 10));
        buttonPanel1.setPreferredSize(new Dimension(250, 235));
        rielButtonPanel.add(buttonPanel1);
        buttonPanel1.setBackground(Color.lightGray);
        // -----------------

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
        JButton button2 = new JButton("2");
        button2.addActionListener(e -> {
            String number = textField.getText() + button2.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button3 = new JButton("3");
        button3.addActionListener(e -> {
            String number = textField.getText() + button3.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> {
            String number = textField.getText() + button4.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> {
            String number = textField.getText() + button5.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {
            String number = textField.getText() + button6.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {
            String alert = textField.getText() + "Not a number";
            textField.setText(alert);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String alert = textField.getText() + "Not a number";
            textField.setText(alert);
        });

        /*------------------------------------------------------------*/
        /* ac */
        JButton ac = new JButton("C");
        ac.addActionListener(e -> textField.setText(""));
        ac.addActionListener(e -> textArea.setText(""));/* end ac */

        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            int numMoney1;

            numMoney1 = (int) Double.parseDouble(textField.getText());
            int oct2Dec = NumberSystemConversionCalculate.octal2Decimal(numMoney1);
            int oct2Bin = NumberSystemConversionCalculate.octal2Binary(numMoney1);
            int oct2Hex = NumberSystemConversionCalculate.octal2Hex(numMoney1);


            textArea.setText(textArea.getText()
                    + " Decimal " + oct2Dec + "\n"
                    + " Binary = " + oct2Bin + "\n"
                    + " Hexadecimal = " + oct2Hex + "\n"

            ); /* ----- end  textArea.setText(textArea.getText() ---------*/
        }); /* end equal */

        buttonPanel1.add(button7);
        buttonPanel1.add(button8);
        buttonPanel1.add(button9);
        buttonPanel1.add(button4);
        buttonPanel1.add(button5);
        buttonPanel1.add(button6);
        buttonPanel1.add(button1);
        buttonPanel1.add(button2);
        buttonPanel1.add(button3);
        buttonPanel1.add(ac);
        buttonPanel1.add(button0);
        buttonPanel1.add(equal);
    } /*----- end Octal convert ------*/

    /*======================== Decimal convert ======================== */
    public void decConvert () {
        /* ------------------- Riel to other Currencies ------------------- */
        // create panel for rielButtonPanel and rielTextFieldPanel
        JPanel rielButtonPanel = new JPanel();
        JPanel rielTextFieldPanel = new JPanel();

        // set new Dimension rielButtonPanel and rielTextFieldPanel
        rielButtonPanel.setPreferredSize(new Dimension(270, 320));
        rielTextFieldPanel.setPreferredSize(new Dimension(315, 320));

        rielButtonPanel.setBackground(Color.pink);
        rielTextFieldPanel.setBackground(Color.pink);

        // add rielButtonPanel and rielTextFieldPanel to rielPanel
        decPanel.add(rielButtonPanel);
        decPanel.add(rielTextFieldPanel);

        // ----------------- textField
        JPanel panelTextField = new JPanel();
        rielButtonPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(250, 70));
        panelTextField.setBackground(Color.pink);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 65));

        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */
        // -----------------
        // ----------------- textArea
        JTextArea textArea = new JTextArea();
        rielTextFieldPanel.add(textArea );
        textArea.setPreferredSize(new Dimension(300, 300));

        Font font2 = new Font("SansSerif", Font.PLAIN, 18); /* create font and size in textField */
        textArea.setFont(font2); /* add font to textField */
        textArea.setEditable(false);
        // -----------------
        // ----------------- button
        JPanel buttonPanel1 = new JPanel(new GridLayout(4,3, 10, 10));
        buttonPanel1.setPreferredSize(new Dimension(250, 235));
        rielButtonPanel.add(buttonPanel1);
        buttonPanel1.setBackground(Color.lightGray);
        // -----------------

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
        JButton button2 = new JButton("2");
        button2.addActionListener(e -> {
            String number = textField.getText() + button2.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button3 = new JButton("3");
        button3.addActionListener(e -> {
            String number = textField.getText() + button3.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> {
            String number = textField.getText() + button4.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> {
            String number = textField.getText() + button5.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {
            String number = textField.getText() + button6.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });

        /*------------------------------------------------------------*/
        /* ac */
        JButton ac = new JButton("C");
        ac.addActionListener(e -> textField.setText(""));
        ac.addActionListener(e -> textArea.setText(""));/* end ac */

        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            int numMoney1;

            numMoney1 = (int) Double.parseDouble(textField.getText());
            int dec2Bin = NumberSystemConversionCalculate.decimal2Binary(numMoney1);
            int dec2Octal = NumberSystemConversionCalculate.decimal2Octal(numMoney1);
            int dec2Hex = NumberSystemConversionCalculate.decimal2Hex(numMoney1);

            textArea.setText(textArea.getText()
                    + " Binary " + dec2Bin + "\n"
                    + " Octal = " + dec2Octal + "\n"
                    + " Hexadecimal = " + dec2Hex + "\n"

            ); /* ----- end  textArea.setText(textArea.getText() ---------*/
        }); /* end equal */

        buttonPanel1.add(button7);
        buttonPanel1.add(button8);
        buttonPanel1.add(button9);
        buttonPanel1.add(button4);
        buttonPanel1.add(button5);
        buttonPanel1.add(button6);
        buttonPanel1.add(button1);
        buttonPanel1.add(button2);
        buttonPanel1.add(button3);
        buttonPanel1.add(ac);
        buttonPanel1.add(button0);
        buttonPanel1.add(equal);
    } /*----- end Decimal convert ------*/

    /*======================== Hexadecimal convert ======================== */
    public void hexConvert () {
        /* ------------------- Riel to other Currencies ------------------- */
        // create panel for rielButtonPanel and rielTextFieldPanel
        JPanel rielButtonPanel = new JPanel();
        JPanel rielTextFieldPanel = new JPanel();

        // set new Dimension rielButtonPanel and rielTextFieldPanel
        rielButtonPanel.setPreferredSize(new Dimension(270, 320));
        rielTextFieldPanel.setPreferredSize(new Dimension(315, 320));

        rielButtonPanel.setBackground(Color.pink);
        rielTextFieldPanel.setBackground(Color.pink);

        // add rielButtonPanel and rielTextFieldPanel to rielPanel
        hexPanel.add(rielButtonPanel);
        hexPanel.add(rielTextFieldPanel);

        // ----------------- textField
        JPanel panelTextField = new JPanel();
        rielButtonPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(250, 70));
        panelTextField.setBackground(Color.pink);

        // create text filed
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 65));

        Font font1 = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textField.setFont(font1); /* add font to textField */
        textField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textField.setEditable(false);
        panelTextField.add(textField); /* add textField to panelTextField */
        // -----------------
        // ----------------- textArea
        JTextArea textArea = new JTextArea();
        rielTextFieldPanel.add(textArea );
        textArea.setPreferredSize(new Dimension(300, 300));

        Font font2 = new Font("SansSerif", Font.PLAIN, 18); /* create font and size in textField */
        textArea.setFont(font2); /* add font to textField */
        textArea.setEditable(false);
        // -----------------
        // ----------------- button
        JPanel buttonPanel1 = new JPanel(new GridLayout(5,4, 10, 10));
        buttonPanel1.setPreferredSize(new Dimension(250, 235));
        rielButtonPanel.add(buttonPanel1);
        buttonPanel1.setBackground(Color.lightGray);
        // -----------------

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
        JButton button2 = new JButton("2");
        button2.addActionListener(e -> {
            String number = textField.getText() + button2.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button3 = new JButton("3");
        button3.addActionListener(e -> {
            String number = textField.getText() + button3.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button4 = new JButton("4");
        button4.addActionListener(e -> {
            String number = textField.getText() + button4.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button5 = new JButton("5");
        button5.addActionListener(e -> {
            String number = textField.getText() + button5.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button6 = new JButton("6");
        button6.addActionListener(e -> {
            String number = textField.getText() + button6.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button7.getText();
            textField.setText(number);
        });

        /*------------------------------------------------------------*/
        JButton A = new JButton("A");
        A.addActionListener(e -> {
            String number = textField.getText() + A.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton B = new JButton("B");
        B.addActionListener(e -> {
            String number = textField.getText() + B.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton C = new JButton("C");
        C.addActionListener(e -> {
            String number = textField.getText() + C.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton D = new JButton("D");
        D.addActionListener(e -> {
            String number = textField.getText() + D.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton E = new JButton("E");
        E.addActionListener(e -> {
            String number = textField.getText() + E.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton F = new JButton("F");
        F.addActionListener(e -> {
            String number = textField.getText() + F.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        /* ac */
        JButton ac = new JButton("C");
        ac.addActionListener(e -> textField.setText(""));
        ac.addActionListener(e -> textArea.setText(""));/* end ac */

        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            double numMoney1;

            numMoney1 = (int) Double.parseDouble(textField.getText());
            double hex2Oct = NumberSystemConversionCalculate.hex2Octal(String.valueOf(numMoney1));
            double hex2Dec = NumberSystemConversionCalculate.hex2Decimal(String.valueOf(numMoney1));
            double hex2Bin = Integer.parseInt(NumberSystemConversionCalculate.hex2Binary(String.valueOf(numMoney1)));


            textArea.setText(textArea.getText()
                    + " Binary " + hex2Oct + "\n"
                    + " Octal = " + hex2Dec + "\n"
                    + " Hexadecimal = " + hex2Bin + "\n"

            ); /* ----- end  textArea.setText(textArea.getText() ---------*/
        }); /* end equal */

        buttonPanel1.add(ac);
        buttonPanel1.add(A);
        buttonPanel1.add(B);
        buttonPanel1.add(C);
        buttonPanel1.add(button7);
        buttonPanel1.add(button8);
        buttonPanel1.add(button9);
        buttonPanel1.add(D);

        buttonPanel1.add(button4);
        buttonPanel1.add(button5);
        buttonPanel1.add(button6);
        buttonPanel1.add(E);

        buttonPanel1.add(button1);
        buttonPanel1.add(button2);
        buttonPanel1.add(button3);
        buttonPanel1.add(F);
        buttonPanel1.add(equal);
        buttonPanel1.add(button0);
    } /*----- end Hexadecimal convert ------*/


    // create Number System conversion
    public NumberSystemConversion (){
        numberSystemPanel = new JPanel();
        numberSystemPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//        numberSystemPanel.setBackground(Color.yellow);

        tabs();
        binConvert();
        octConvert();
        decConvert();
        hexConvert();
    } // -- end Number System Conversion --
    //    ====================== End number system conversion ========================  //


}
