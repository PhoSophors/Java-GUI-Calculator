/**
 * Storage converter
 * date : wed, 10 Aug 2022
 * name : Pho SoPhors
 */

import javax.swing.*;
import java.awt.*;

public class StorageConverter {

    public static final String STORAGE = "Storage Converter"; // storage convertor
    JPanel storageConverterPanel;
    JPanel bytePanel = new JPanel();
    JPanel kilobytePanel = new JPanel();
    JPanel megabytePanel = new JPanel();
    JPanel gigabytePanel = new JPanel();
    JPanel terabytePanel = new JPanel();
    JPanel petabytePanel = new JPanel();


    private void designTabs() {

        JPanel frameTabs = new JPanel(); // create the frame for tab
        JPanel slider = new JPanel();

        /*--------------------------------------------------------------*/
        // adding slider to arithmeticPanel
        storageConverterPanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("STORAGE CONVERTER");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        //Create the tab container
        JTabbedPane tabs = new JTabbedPane();
        tabs.setPreferredSize(new Dimension(620, 380));
        //Associate each panel with the corresponding tab
        tabs.add("Byte to (KB, MB, GB, TB, PB)    ", bytePanel);
        tabs.add("Kilobyte to (B, MB, GB, TB, PB)", kilobytePanel);
        tabs.add("Megabyte to (B, KB, GB, TB, PB)", megabytePanel);
        tabs.add("Gigabyte to (B, KB, MB, TB, PB)", gigabytePanel);
        tabs.add("Terabyte to (B, KB, MB, GB, PB)", terabytePanel);
        tabs.add("Petabyte to (B, KB, MB, GB, TB) ", petabytePanel);

        //Add tabs to the frame
        frameTabs.add(tabs);
        frameTabs.setPreferredSize(new Dimension(600, 410));

        // add frameTabs to moneyExchange
        storageConverterPanel.add(frameTabs);
        /*--------------------------------------------------------------*/
    }

    /*======================== byteConvert ======================== */
    public void byteConvert () {
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
        bytePanel.add(rielButtonPanel);
        bytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float byte2KB = StorageConverterCalculate.byte2KB(numMoney1);
            float byte2MB = StorageConverterCalculate.byte2MB(numMoney1);
            float byte2GB = StorageConverterCalculate.byte2GB(numMoney1);
            float byte2TB = StorageConverterCalculate.byte2TB(numMoney1);
            float byte2PB = StorageConverterCalculate.byte2PB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " B = " + byte2KB + " KB\n"
                    + numMoney1 + " B = " + byte2MB + " MB\n"
                    + numMoney1 + " B = " + byte2GB + " GB\n"
                    + numMoney1 + " B = " + byte2TB + " TB\n"
                    + numMoney1 + " B = " + byte2PB + " PB\n"

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
    } /*----- end byte convert ------*/

    /*======================== kiloByteConvert ======================== */
    public void kiloByteConvert () {
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
        kilobytePanel.add(rielButtonPanel);
        kilobytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float KB2B = StorageConverterCalculate.KB2B(numMoney1);
            float KB2MB = StorageConverterCalculate.KB2MB(numMoney1);
            float KB2GB = StorageConverterCalculate.KB2GB(numMoney1);
            float KB2TB = StorageConverterCalculate.KB2TB(numMoney1);
            float KB2PB = StorageConverterCalculate.KB2PB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " KB = " + KB2B + " B\n"
                    + numMoney1 + " KB = " + KB2MB + " MB\n"
                    + numMoney1 + " KB = " + KB2GB + " GB\n"
                    + numMoney1 + " KB = " + KB2TB + " TB\n"
                    + numMoney1 + " KB = " + KB2PB + " PB\n"

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
    } /*----- end kiloByteConvert------*/

    /*======================== megaByteConvert ======================== */
    public void megaByteConvert () {
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
        megabytePanel.add(rielButtonPanel);
        megabytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float MB2B = StorageConverterCalculate.MB2B(numMoney1);
            float MB2KB = StorageConverterCalculate.MB2KB(numMoney1);
            float MB2GB = StorageConverterCalculate.MB2GB(numMoney1);
            float MB2TB = StorageConverterCalculate.MB2TB(numMoney1);
            float MB2PB = StorageConverterCalculate.MB2PB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " MB = " + MB2B + " B\n"
                    + numMoney1 + " MB = " + MB2KB + " KG\n"
                    + numMoney1 + " MB = " + MB2GB + " GB\n"
                    + numMoney1 + " MB = " + MB2TB + " TB\n"
                    + numMoney1 + " MB = " + MB2PB + " PB\n"

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
    } /*----- end megaByteConvert  ------*/

    /*======================== gigaByteConvert ======================== */
    public void gigaByteConvert () {
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
        gigabytePanel.add(rielButtonPanel);
        gigabytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float GB2B = StorageConverterCalculate.GB2B(numMoney1);
            float GB2KB = StorageConverterCalculate.GB2KB(numMoney1);
            float GB2MB = StorageConverterCalculate.GB2MB(numMoney1);
            float GB2TB = StorageConverterCalculate.GB2TB(numMoney1);
            float GB2PB = StorageConverterCalculate.GB2PB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " GB = " + GB2B + " B\n"
                    + numMoney1 + " GB = " + GB2KB + " KG\n"
                    + numMoney1 + " GB = " + GB2MB + " MB\n"
                    + numMoney1 + " GB = " + GB2TB + " TB\n"
                    + numMoney1 + " GB = " + GB2PB + " PB\n"

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
    } /*----- end  gigaByteConvert ------*/

    /*======================== teraByteConvert ======================== */
    public void teraByteConvert () {
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
        terabytePanel.add(rielButtonPanel);
        terabytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float TB2B = StorageConverterCalculate.TB2B(numMoney1);
            float TB2KB = StorageConverterCalculate.TB2KB(numMoney1);
            float TB2MB = StorageConverterCalculate.TB2MB(numMoney1);
            float TB2GB = StorageConverterCalculate.TB2GB(numMoney1);
            float TB2PB = StorageConverterCalculate.TB2PB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " TB = " + TB2B + " B\n"
                    + numMoney1 + " TB = " + TB2KB + " KB\n"
                    + numMoney1 + " TB = " + TB2MB + " MB\n"
                    + numMoney1 + " TB = " + TB2GB + " GB\n"
                    + numMoney1 + " TB = " + TB2PB + " PB\n"

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
    } /*----- end  teraByteConvert ------*/

    /*======================== petaByteConvert ======================== */
    public void petaByteConvert () {
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
        petabytePanel.add(rielButtonPanel);
        petabytePanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button8.getText();
            textField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String number = textField.getText() + button9.getText();
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
            float PB2B = StorageConverterCalculate.PB2B(numMoney1);
            float PB2KB = StorageConverterCalculate.PB2KB(numMoney1);
            float PB2MB = StorageConverterCalculate.PB2MB(numMoney1);
            float PB2GB = StorageConverterCalculate.PB2GB(numMoney1);
            float PB2TB = StorageConverterCalculate.PB2TB(numMoney1);

            textArea.setText(textArea.getText()
                    + numMoney1 + " PB = " + PB2B + " B\n"
                    + numMoney1 + " PB = " + PB2KB + " KB\n"
                    + numMoney1 + " PB = " + PB2MB + " MB\n"
                    + numMoney1 + " PB = " + PB2GB + " GB\n"
                    + numMoney1 + " PB = " + PB2TB + " TB\n"

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
    } /*----- end  petaByteConvert ------*/


    // create Storage Converter
    public StorageConverter () {
        storageConverterPanel = new JPanel();
        storageConverterPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        designTabs(); /*-- call designTabs methods --*/
        byteConvert(); /*-- call byteConvert methods --*/
        kiloByteConvert(); /*-- call kiloByteConvert methods --*/
        megaByteConvert(); /*-- call megaByteConvert methods --*/
        gigaByteConvert(); /*-- call gigaByteConvert methods --*/
        teraByteConvert(); /*-- call teraByteConvert methods --*/
        petaByteConvert(); /*-- call petaByteConvert methods --*/
    } // -- end Storage Converter --
    //    ====================== End storage conversion ========================  //

}
