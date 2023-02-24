/**
 * Arithmetic put together with Trigonometry
 * date: Tuesday, 24 July 2022
 * name : Pho Sophors
 */

import javax.swing.*;
import java.awt.*;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.Objects;

public class ArithmeticAndTrigonometry {
    public static final String ARITHMETIC = "Arith and Trigo";

    double num1, num2, result;
    String operation = "";
    
    //create UI in panel
    public JPanel arithmeticPanel;
    
    private void arithmeticTrigonometry(){

        // create panel
        JPanel slider = new JPanel();
        JPanel panelTextField = new JPanel();
        JPanel panelButton = new JPanel(new GridLayout(5,5,1,1));

        // adding slider to arithmeticPanel
        arithmeticPanel.add(slider);
        slider.setPreferredSize(new Dimension(600, 30));
        JLabel text = new JLabel("ARITHMETIC AND TRIGONOMETRY");
        Font font = new Font("SansSerif", Font.PLAIN, 25);
        text.setFont(font);
        slider.add(text); // adding slider to text

        // adding panelTextField to arithmeticPanel and setSize
        arithmeticPanel.add(panelTextField);
        panelTextField.setPreferredSize(new Dimension(600, 100));
        panelTextField.setBackground(Color.white);

        // adding panelButton to arithmeticPanel and setSize
        arithmeticPanel.add(panelButton);
        panelButton.setPreferredSize(new Dimension(600, 260));
        panelButton.setBackground(Color.pink);

        /*---- create history textField */
        JTextField history = new JTextField();
        history.setPreferredSize(new Dimension(600, 30));
        Font fontHistory = new Font("SansSerif", Font.PLAIN, 20);
        history.setForeground(Color.pink);
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
        /* subtract */
        JButton subtract = new JButton("+");
        subtract.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "+";
            textField.setText("");
            history.setText(history.getText() + operation + textField.getText());
        }); /* end subtract */
        /*------------------------------------------------------------*/
        /* minus */
        JButton minus = new JButton("-");
        minus.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
            history.setText(history.getText() + operation + textField.getText());
        }); /* end minus */
        /*------------------------------------------------------------*/
        /* multiply*/
        JButton multiply = new JButton("x");
        multiply.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "x";
            textField.setText("");
            history.setText(history.getText() + operation + textField.getText());
        }); /* end multiply*/
        /*------------------------------------------------------------*/
        /* division */
        JButton division = new JButton("÷");
        division.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
            history.setText(history.getText() + operation + textField.getText());
        }); /* end division */
        /*------------------------------------------------------------*/
        /* mod */
        JButton mod = new JButton("%");
        mod.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "%";
            textField.setText("");
            history.setText(history.getText() + operation + textField.getText());
        });  /* end mod */
        /*------------------------------------------------------------*/
        /*  subtractMinus */
        JButton subtractMinus = new JButton("±");
        subtractMinus.addActionListener(e -> {
            num1 = Double.parseDouble(String.valueOf(textField.getText()));
            num1 *= (-1);
            textField.setText(String.valueOf(num1));
            history.setText( textField.getText());
        }); /* end subtractMinus */
        /*------------------------------------------------------------*/
        /* sin */
        JButton sin = new JButton("sin");
        sin.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "sin";
        }); /* end sin */
        /*------------------------------------------------------------*/
        /* end sin */
        JButton sind = new JButton("sind");
        sind.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "sind";
//                textField.setText("");
        }); /* end sind */
        /*------------------------------------------------------------*/
        /* end cos */
        JButton cos = new JButton("cos");
        cos.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "cos";
//                textField.setText("");
        }); /* end cos */
        /*------------------------------------------------------------*/
        /* end cos */
        JButton cosd = new JButton("cosd");
        cosd.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "cosd";
//                textField.setText("");
        }); /* end cosd */
        /*------------------------------------------------------------*/
        /* end tan */
        JButton tan = new JButton("tan");
        tan.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "tan";
        }); /* end tan */
        /*------------------------------------------------------------*/
        /* tand */
        JButton tand = new JButton("tand");
        tand.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "tand";
        }); /* end tand */
        /*------------------------------------------------------------*/
        /* sinh */
        JButton sinh = new JButton("sinh");
        sinh.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "sinh";
        });/* end sinh*/
        /*------------------------------------------------------------*/
        JButton cosh = new JButton("cosh");
        cosh.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "cosh";
        });/* end cosh*/
        /*------------------------------------------------------------*/
        JButton tanh = new JButton("tanh");
        tanh.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "tanh";
        });/* end tanh*/
        /*------------------------------------------------------------*/
        /* x^2*/
        JButton x2 = new JButton("X²");
        x2.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "X²";
        }); /* end x^2 */
        /*------------------------------------------------------------*/
        /* x^3 */
        JButton x3 = new JButton("X³");
        x3.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "X³";
        }); /* end x^3 */
        /*------------------------------------------------------------*/
        /* √x */
        JButton squareRoot = new JButton("√x");
        squareRoot.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "square_root";
        });/* √x */
        /*------------------------------------------------------------*/
        /* 3√x */
        JButton xx3 = new JButton("∛x");
        xx3.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "xx3";
        }); /* End 3√x */
        /*------------------------------------------------------------*/
        /* 4√x */
        JButton xx4 = new JButton("∜x");
        xx4.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "xx4";
        }); /* END 4√x*/
        /*------------------------------------------------------------*/
        JButton xFact = new JButton("x!");
        xFact.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "x!";
        });/* end xFuck */
        /*------------------------------------------------------------*/
        JButton pi = new JButton("π");
        pi.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operation = "pi";
        });/* end PI */
        /*------------------------------------------------------------*/
        /* click */
        JButton click = new JButton(".");
        click.addActionListener(e -> {
            String number = textField.getText() + click.getText();
            textField.setText(number);
            history.setText( textField.getText());
        }); /* end click */
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
            num2 = Double.parseDouble(textField.getText());

            if(Objects.equals(operation, "+")) {
                result = num1 + num2;
                textField.setText("" + result);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operation, "-")) {
                result = num1 - num2;
                textField.setText("" + result);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operation, "x")) {
                result = num1 * num2;
                textField.setText("" + result);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operation, "/")) {
                result = num1 / num2;
                textField.setText("" + result);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operation, "%")) {
                result = num1 % num2;
                textField.setText("" + result);
                history.setText("" + history.getText());
            }
            else if (Objects.equals(operation, "sin")) {
                double r = Math.sin(Math.toRadians(num1 * 180 / Math.PI));
                textField.setText("" + r);
                history.setText("sin(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "sind")) {
                double r = Math.toRadians(num1);
                double degree = Math.sin(r);
                textField.setText("" + degree);
                history.setText("sin(" + history.getText() +" degree)");
            }
            else if (Objects.equals(operation, "sinh")) {
                // print the hyperbolic tangent of these doubles
                textField.setText("" + Math.sinh(num1));
                history.setText("sinh(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "cos")) {
                double r = Math.cos(Math.toRadians(num1 * 180 / Math.PI));
                textField.setText("" + r);
                history.setText("cos(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "cosd")) {
                double r = Math.toRadians(num1);
                double degree = Math.cos(r);
                textField.setText("" + degree);
                history.setText("cos(" + history.getText() +" degree)");
            }
            else if (Objects.equals(operation, "cosh")) {
                // print the hyperbolic tangent of these doubles
                textField.setText("" + Math.cosh(num1));
                history.setText("cosh(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "tan")) {
                double r = Math.tan(Math.toRadians(num1 * 180 / Math.PI));
                textField.setText("" + r);
                history.setText("tan(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "tand")) {
                double r = Math.toRadians(num1);
                double degree = Math.tan(r);
                textField.setText("" + degree);
                history.setText("tanh(" + history.getText() +" radian)");
            }
            else if (Objects.equals(operation, "tanh")) {
                // print the hyperbolic tangent of these doubles
                textField.setText("" + Math.tanh(num1));
                history.setText("tanh(" + history.getText() +" radian)");

            }
            else if (Objects.equals(operation, "x!")) {
                int j;
                int multiply1 = 1; // multiply start from 1
                for ( j = 1; j <= num1; j++) // the first num1 natural number
                {
                    multiply1 = multiply1 * j; // multiply of the first num1 natural number
                    textField.setText("" + multiply1); // output
                } // end for loop
                history.setText("" + history.getText() +"!" );
            }
            else if (Objects.equals(operation, "X²")) {
                double r = Math.pow(num1, 2);
                textField.setText("" + r);
                history.setText(" " + history.getText());
                history.setText("" + history.getText()  + "²");
            }
            else if (Objects.equals(operation, "X³")) {
                double r = Math.pow(num1, 3);
                textField.setText("" + r);
                history.setText("" + history.getText() + "³");
            }
            else if (Objects.equals(operation, "square_root")) {
                double r = StrictMath.sqrt(num1);
                textField.setText("" + r);
                history.setText("√ " + history.getText());
            }
            else if (Objects.equals(operation, "xx3")) {
                double r = Math.cbrt(num1);
                textField.setText("" + r);
                history.setText("∛" + history.getText());
            }
            else if (Objects.equals(operation, "xx4")) {
                double r = Math.pow(num1, (0.25));
                textField.setText("" + r);
                history.setText("∜" + history.getText());
            }
            else if (Objects.equals(operation, "pi")) {
                double r = num1 * 3.141592653589793;
                textField.setText("" + r );
                history.setText("" + history.getText() +"π" );
            }
        }); /* END equal*/

        /* Set Font Size in a JButton */
        sin.setFont(new Font("SansSerif", Font.PLAIN, 17));
        sind.setFont(new Font("SansSerif", Font.PLAIN, 17));
        sinh.setFont(new Font("SansSerif", Font.PLAIN, 17));
        subtractMinus.setFont(new Font("SansSerif", Font.PLAIN, 20));
        mod.setFont(new Font("SansSerif", Font.PLAIN, 20));
        division.setFont(new Font("SansSerif", Font.PLAIN, 20));
        ac.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /*-----------------------------------------------------------*/
        cos.setFont(new Font("SansSerif", Font.PLAIN, 17));
        cosd.setFont(new Font("SansSerif", Font.PLAIN, 17));
        cosh.setFont(new Font("SansSerif", Font.PLAIN, 17));
        button7.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button8.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button9.setFont(new Font("SansSerif", Font.PLAIN, 20));
        multiply.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /*-----------------------------------------------------------*/
        tan.setFont(new Font("SansSerif", Font.PLAIN, 17));
        tand.setFont(new Font("SansSerif", Font.PLAIN, 17));
        tanh.setFont(new Font("SansSerif", Font.PLAIN, 17));
        button4.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button5.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button6.setFont(new Font("SansSerif", Font.PLAIN, 20));
        minus.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /*-----------------------------------------------------------*/
        xFact.setFont(new Font("SansSerif", Font.PLAIN, 17));
        x2.setFont(new Font("SansSerif", Font.PLAIN, 17));
        x3.setFont(new Font("SansSerif", Font.PLAIN, 17));
        button1.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button2.setFont(new Font("SansSerif", Font.PLAIN, 20));
        button3.setFont(new Font("SansSerif", Font.PLAIN, 20));
        subtract.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /*-----------------------------------------------------------*/
        pi.setFont(new Font("SansSerif", Font.PLAIN, 17));
        squareRoot.setFont(new Font("SansSerif", Font.PLAIN, 17));
        xx3.setFont(new Font("SansSerif", Font.PLAIN, 17));
        xx4.setFont(new Font("SansSerif", Font.PLAIN, 17));
        button0.setFont(new Font("SansSerif", Font.PLAIN, 20));
        click.setFont(new Font("SansSerif", Font.PLAIN, 20));
        equal.setFont(new Font("SansSerif", Font.PLAIN, 20));
        /* END Set Font Size in a JButton */

        panelButton.add(sin);
        panelButton.add(sind);
        panelButton.add(sinh);
        panelButton.add(ac);
        panelButton.add(subtractMinus);
        panelButton.add(mod);
        panelButton.add(division);
        /*------------------------------*/
        panelButton.add(cos);
        panelButton.add(cosd);
        panelButton.add(cosh);
        panelButton.add(button7);
        panelButton.add(button8);
        panelButton.add(button9);
        panelButton.add(multiply);
        /*------------------------------*/
        panelButton.add(tan);
        panelButton.add(tand);
        panelButton.add(tanh);
        panelButton.add(button4);
        panelButton.add(button5);
        panelButton.add(button6);
        panelButton.add(minus);
        /*------------------------------*/
        panelButton.add(xFact);
        panelButton.add(x2);
        panelButton.add(x3);
        panelButton.add(button1);
        panelButton.add(button2);
        panelButton.add(button3);
        panelButton.add(subtract);
        /*------------------------------*/
        panelButton.add(pi);
        panelButton.add(squareRoot);
        panelButton.add(xx3);
        panelButton.add(xx4);
        panelButton.add(button0);
        panelButton.add(click);
        panelButton.add(equal);
    } // end arithmeticDesign
    //    ====================== End Arithmetic ========================  //

    public ArithmeticAndTrigonometry(){
        arithmeticPanel = new JPanel();
        arithmeticPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        /* call arithmeticDesign */
        arithmeticTrigonometry();

    } // -- end arithmetic --
}
