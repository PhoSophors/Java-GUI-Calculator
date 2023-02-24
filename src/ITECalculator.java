/**
 * ITECalculator
 * name : Pho SoPhors
 * data: tuesday, 2 August 2022
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ITECalculator extends JFrame implements ActionListener {

    private JPanel card;

    // create Panel
    private void createPanel(){
        // calling methods
        ArithmeticAndTrigonometry arithmeticAndTrigonometry = new ArithmeticAndTrigonometry();
        BitwiseOperator bitwiseOperator = new BitwiseOperator();
        MoneyExchange moneyExchange = new MoneyExchange();
        StorageConverter storageConverter = new StorageConverter();
        NumberSystemConversion numberSystemConversion = new NumberSystemConversion();
        BinaryArithmetic binaryArithmetic = new BinaryArithmetic();

        card = new JPanel(new CardLayout());

        card.add(ArithmeticAndTrigonometry.ARITHMETIC,arithmeticAndTrigonometry.arithmeticPanel);
        card.add(BitwiseOperator.BITWISE,bitwiseOperator.bitwisePanel);
        card.add(MoneyExchange.MONEY, moneyExchange.moneyExchangePanel);
        card.add(StorageConverter.STORAGE, storageConverter.storageConverterPanel);
        card.add(NumberSystemConversion.NUMBER, numberSystemConversion.numberSystemPanel);
        card.add(BinaryArithmetic.BINARY, binaryArithmetic.binaryArithmeticPanel);

    } // end create panel

    // public ITECalculator
    public ITECalculator(){

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.darkGray);
        createPanel();

        JPanel menuPanel = new JPanel(new GridLayout(10, 1, -3, -3));

        //create menuButton
        JButton arithmeticButton = new JButton(ArithmeticAndTrigonometry.ARITHMETIC);
        JButton bitwiseButton = new JButton(BitwiseOperator.BITWISE);
        JButton moneyExchangeButton = new JButton(MoneyExchange.MONEY);
        JButton storageConverterButton = new JButton(StorageConverter.STORAGE);
        JButton numberSystemButton = new JButton(NumberSystemConversion.NUMBER);
        JButton binaryArithmeticButton = new JButton(BinaryArithmetic.BINARY);

        arithmeticButton.addActionListener(this);
        bitwiseButton.addActionListener(this);
        moneyExchangeButton.addActionListener(this);
        storageConverterButton.addActionListener(this);
        numberSystemButton.addActionListener(this);
        binaryArithmeticButton.addActionListener(this);

        menuPanel.add(arithmeticButton);
        menuPanel.add(bitwiseButton);
        menuPanel.add(moneyExchangeButton);
        menuPanel.add(storageConverterButton);
        menuPanel.add(numberSystemButton);
        menuPanel.add(binaryArithmeticButton);

        panel.add(menuPanel);
        add(panel,BorderLayout.WEST);
        add(card, BorderLayout.CENTER);
    } // end ITECalculator

    // Override actionPerformed
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CardLayout cardLayout = (CardLayout) card.getLayout();
        cardLayout.show(card, actionEvent.getActionCommand());
        System.out.println("String : "+actionEvent.paramString());
    } // end actionPerformed
}
