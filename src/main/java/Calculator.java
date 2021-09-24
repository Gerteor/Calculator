//Calculator with interface
import treatment.Treatment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
  /*  int res = 0;
    int res1 = 0;
*/
    public Calculator() {
        super("Calculator");
        try {
            setLayout(null);
            final TextField txtWind = new TextField();
            txtWind.setBounds(10, 10, 250, 25);

            JButton b0 = new JButton("0");
            // b0.setBounds(10, 270, 75, 50);
            b0.setBounds(10, 40, 50, 50);
            JButton b1 = new JButton("1");
            //b1.setBounds(10, 190, 50, 50);
            b1.setBounds(60, 40, 50, 50);

            JButton b2 = new JButton("2");
            // b2.setBounds(60, 190, 50, 50);
            b2.setBounds(110, 40, 50, 50);

            JButton b3 = new JButton("3");
            //b3.setBounds(110, 190, 50, 50);
            b3.setBounds(160, 40, 50, 50);

            JButton b4 = new JButton("4");
            //b4.setBounds(10, 110, 50, 50);
            b4.setBounds(210, 40, 50, 50);

            JButton b5 = new JButton("5");
            //b5.setBounds(60, 110, 50, 50);
            b5.setBounds(10, 110, 50, 50);

            JButton b6 = new JButton("6");
            //b6.setBounds(110, 110, 50, 50);
            b6.setBounds(60, 110, 50, 50);

            JButton b7 = new JButton("7"); //0
            //b7.setBounds(10, 40, 50, 50);
            b7.setBounds(110, 110, 50, 50);

            JButton b8 = new JButton("8");
            //b8.setBounds(60, 40, 50, 50);
            b8.setBounds(160, 110, 50, 50);

            JButton b9 = new JButton("9");
            // b9.setBounds(110, 40, 50, 50);
            b9.setBounds(210, 110, 50, 50);

            JButton bRes = new JButton("=");
            // bRes.setBounds(85, 270, 75, 50);
            bRes.setBounds(10, 190, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);

            JButton bPlus = new JButton("+");
            // bPlus.setBounds(170, 40, 75, 50);
            bPlus.setBounds(60, 190, 50, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);

            JButton bMinus = new JButton("-");
            // bMinus.setBounds(170, 110, 75, 50);
            bMinus.setBounds(110, 190, 50, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);

            JButton bMulti = new JButton("*");
            // bMulti.setBounds(170, 190, 75, 50);
            bMulti.setBounds(160, 190, 50, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);

            JButton bDivision = new JButton("/");
            // bDivision.setBounds(170, 270, 75, 50);
            bDivision.setBounds(210, 190, 50, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);

            JButton bRemoveVal = new JButton("C");
            bRemoveVal.setBounds(190, 250, 50, 50);
            Font bigFontRemove = new Font("serif", Font.BOLD, 22);
            bRemoveVal.setFont(bigFontRemove);

            JButton bRemoveLast = new JButton("↤");
            bRemoveLast.setBounds(25, 250, 160, 50);
            Font bigFontRemoveLast = new Font("serif", Font.BOLD, 21);
            bRemoveLast.setFont(bigFontRemoveLast);

            add(txtWind);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bRemoveVal);
            add(bRemoveLast);

            b0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 0);

                }
            });

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 1);

                }
            });
            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 2);

                }
            });
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 3);

                }
            });
            b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 4);

                }
            });
            b5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 5);

                }
            });
            b6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 6);

                }
            });
            b7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 7);

                }
            });
            b8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 8);

                }
            });
            b9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + 9);

                }
            });

            bPlus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + "+");

                }
            });

            bMinus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + "-");

                }
            });

            bDivision.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + "/");

                }
            });

            bMulti.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    txtWind.setText(txtWind.getText() + "*");

                }
            });

            bRemoveVal.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                   txtWind.setText("");
                }
            });

            bRemoveLast.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg1) {
                    String a = txtWind.getText();
                    txtWind.setText(removeLastChar(a));
                }
            });

            bRes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    System.out.println(txtWind.getText());

                    Treatment treatment = new Treatment(txtWind.getText());
                    treatment.toString();

                    String strRes = treatment.toString().trim();
                    txtWind.setText(strRes);
                }
            });
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setBounds(100, 100, 285, 350);

    }
}
