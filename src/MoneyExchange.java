/**
 * Money Exchange
 * date : wed, 10 Aug 2022
 * name : Pho SoPhors
 */

import javax.swing.*;
import java.awt.*;

public class MoneyExchange {
    public static final String MONEY = "Money Exchange"; // money exchange
    JPanel moneyExchangePanel;
    JPanel rielPanel = new JPanel();
    JPanel currenciesPanel = new JPanel();

    /*==============================================  moneyExchangeDesignTab   ==============================================*/
    private void moneyExchangeDesignTab(){
        // create the frame for tab
        JPanel frameTabs = new JPanel();
        // create panel

        JPanel slider = new JPanel();

        /*--------------------------------------------------------------*/
        // adding slider to arithmeticPanel
        moneyExchangePanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("MONEY EXCHANGE");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        //Create the tab container
        JTabbedPane tabs = new JTabbedPane();
        tabs.setPreferredSize(new Dimension(620, 380));
        //Associate each panel with the corresponding tab
        tabs.add("Riel to Other Currencies", rielPanel);
        tabs.add("Other Currencies to Riel", currenciesPanel);

        //Add tabs to the frame
        frameTabs.add(tabs);
        frameTabs.setPreferredSize(new Dimension(600, 410));

        // add frameTabs to moneyExchange
        moneyExchangePanel.add(frameTabs);
        /*--------------------------------------------------------------*/

    }
    /*============================================== end moneyExchangeDesignTab   ==============================================*/

    /*============================================== Riel to other currencies ==============================================*/
    private void riel2OtherCurrencies () {
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
        rielPanel.add(rielButtonPanel);
        rielPanel.add(rielTextFieldPanel);

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
            String number = textField.getText() + button0.getText();
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
        /*------------------------------------------------------------*/

        JButton equal = new JButton("=");
        /* actionPerformed */
        equal.addActionListener(e -> {
            int numMoney1;
            float
                    dollar = 4050,
                    euro = 4600,
                    franc = 4500,
                    pound =  6000,
                    bath = 100;

            numMoney1 = (int) Double.parseDouble(textField.getText());
            float dollarR = numMoney1 / dollar;
            float euroR = numMoney1 / euro;
            float francR = numMoney1 / franc;
            float poundR = numMoney1 / pound;
            float bathR = numMoney1 / bath;



            textArea.setText(textArea.getText()
                    + numMoney1 + "riel = " + dollarR + " dollar\n"
                    + numMoney1 + "riel = " + euroR + " euro\n"
                    + numMoney1 + "riel = " + francR + " franc\n"
                    + numMoney1 + "riel = " + poundR + " pound\n"
                    + numMoney1 + "riel = " + bathR + " bath\n"
            );
        });

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
    }
    /*============================================== end Riel to other currencies ==============================================*/

    /*============================================== Other currencies to riel ==============================================*/
    private void otherCurrencies2Riel () {
        /* ------------------- Other Currencies to riel ------------------- */
        // create panel for rielButtonPanel and rielTextFieldPanel
        JPanel currenciesButtonPanel = new JPanel();
        JPanel currenciesTextFieldPanel = new JPanel();

        // set new Dimension rielButtonPanel and rielTextFieldPanel
        currenciesButtonPanel.setPreferredSize(new Dimension(270, 320));
        currenciesTextFieldPanel.setPreferredSize(new Dimension(315, 320));

        currenciesButtonPanel.setBackground(Color.pink);
        currenciesTextFieldPanel.setBackground(Color.pink);

        // add rielButtonPanel and rielTextFieldPanel to rielPanel
        currenciesPanel.add(currenciesButtonPanel);
        currenciesPanel.add(currenciesTextFieldPanel);

        // ----------------- textField
        JPanel panelCurrenciesTextField = new JPanel();
        currenciesButtonPanel.add(panelCurrenciesTextField);
        panelCurrenciesTextField.setPreferredSize(new Dimension(250, 70));
        panelCurrenciesTextField.setBackground(Color.pink);

        // create text filed
        JTextField textCurrenciesField = new JTextField();
        textCurrenciesField.setPreferredSize(new Dimension(250, 65));

        Font fontCurrencies = new Font("SansSerif", Font.PLAIN, 35); /* create font and size in textField */
        textCurrenciesField.setFont(fontCurrencies); /* add font to textField */
        textCurrenciesField.setHorizontalAlignment(JTextField.RIGHT); /* assign text to right */
        textCurrenciesField.setEditable(false);
        panelCurrenciesTextField.add(textCurrenciesField); /* add textField to panelTextField */
        // -----------------
        // ----------------- textArea
        JTextArea textAreaCurrencies = new JTextArea();
        currenciesTextFieldPanel.add(textAreaCurrencies);
        textAreaCurrencies.setPreferredSize(new Dimension(300, 300));

        Font font4 = new Font("SansSerif", Font.PLAIN, 18); /* create font and size in textField */
        textAreaCurrencies.setFont(font4); /* add font to textField */
        textAreaCurrencies.setEditable(false);
        // -----------------
        // ----------------- button
        JPanel buttonPanel1Currencies = new JPanel(new GridLayout(5,3, 1, 1));
        buttonPanel1Currencies.setPreferredSize(new Dimension(250, 235));
        currenciesButtonPanel.add(buttonPanel1Currencies);
        buttonPanel1Currencies.setBackground(Color.lightGray);
        // -----------------

        /*------------------------------------------------------------*/
        // create button
        JButton button0C = new JButton("0");
        button0C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button0C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button1C = new JButton("1");
        button1C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button1C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button2C = new JButton("2");
        button2C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button2C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button3C= new JButton("3");
        button3C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button3C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button4C = new JButton("4");
        button4C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button4C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button5C = new JButton("5");
        button5C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button5C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button6C = new JButton("6");
        button6C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button6C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button7C = new JButton("7");
        button7C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button7C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button8C = new JButton("8");
        button8C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button8C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        JButton button9C = new JButton("9");
        button9C.addActionListener(e -> {
            String number = textCurrenciesField.getText() + button9C.getText();
            textCurrenciesField.setText(number);
        });
        /*------------------------------------------------------------*/
        /* ac */
        JButton acC = new JButton("C");
        acC.addActionListener(e -> textCurrenciesField.setText(""));
        acC.addActionListener(e -> textAreaCurrencies.setText(""));/* end ac */
        /*------------------------------------------------------------*/
        /* click */
        JButton click = new JButton(".");
        click.addActionListener(e -> {
            String number = textCurrenciesField.getText() + click.getText();
            textCurrenciesField.setText(number);
        }); /* end click */
        /*------------------------------------------------------------*/

        JButton equalC = new JButton("=");
        /* actionPerformed */
        equalC.addActionListener(e -> {
            double numMoney1;
            double
                    dollarC = 4050,
                    euroC = 4600,
                    francC = 4500,
                    poundC =  6000,
                    bathC = 100;

            numMoney1 = Double.parseDouble(textCurrenciesField.getText());
            int dollarRC = (int) (numMoney1 * dollarC);
            int euroRC = (int) (numMoney1 * euroC);
            int francRC = (int) (numMoney1 * francC);
            int poundRC = (int) (numMoney1 * poundC);
            int bathRC = (int) (numMoney1 * bathC);

            textAreaCurrencies.setText(textAreaCurrencies.getText()
                    + numMoney1 + " dollar = " + dollarRC + " riel\n"
                    + numMoney1 + " euro = " + euroRC + " riel\n"
                    + numMoney1 + " franc = " + francRC + " riel\n"
                    + numMoney1 + " pound = " + poundRC + " riel\n"
                    + numMoney1 + " bath = " + bathRC + " riel\n"
            );
        });

        buttonPanel1Currencies.add(button7C);
        buttonPanel1Currencies.add(button8C);
        buttonPanel1Currencies.add(button9C);
        buttonPanel1Currencies.add(button4C);
        buttonPanel1Currencies.add(button5C);
        buttonPanel1Currencies.add(button6C);
        buttonPanel1Currencies.add(button1C);
        buttonPanel1Currencies.add(button2C);
        buttonPanel1Currencies.add(button3C);
        buttonPanel1Currencies.add(acC);
        buttonPanel1Currencies.add(button0C);
        buttonPanel1Currencies.add(click);
        buttonPanel1Currencies.add(equalC);
    }
    /*============================================== end other currencies to riel ==============================================*/


    // create Money Exchange
    public MoneyExchange (){
        moneyExchangePanel = new JPanel();
        moneyExchangePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        // moneyExchangePanel.setBackground(Color.green);

        moneyExchangeDesignTab();
        riel2OtherCurrencies();
        otherCurrencies2Riel();
    } // -- end Money Exchange --
}
