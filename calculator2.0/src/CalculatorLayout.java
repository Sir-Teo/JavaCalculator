/*
Java Calculator!
By Sir-Teo
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorLayout {
    private JTextPane TextDisplay;
    private JButton Num1;
    private JButton Num2;
    private JButton Num3;
    private JButton Num4;
    private JButton Num5;
    private JButton Num6;
    private JButton Num7;
    private JButton Num8;
    private JButton Num9;
    private JButton Plus;
    private JButton minus;
    private JButton equal;
    private JPanel CalPane;
    private JButton Enter;
    private JButton clearAll;
    private JButton Multiply;
    private JButton Divide;
    private JLabel welcomeLabel;
    private JLabel Label2;
    private JButton Dot;

    public CalculatorLayout() {

        Calculator cal = new Calculator();

        Num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(1));
            }
        });

        Num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(2));
            }
        });

        Num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(3));
            }
        });

        Num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(4));
            }
        });

        Num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(5));
            }
        });

        Num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(6));
            }
        });

        Num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(7));
            }
        });

        Num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(8));
            }
        });

        Num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextDisplay.getText();
                TextDisplay.setText(str + Double.toString(9));
            }
        });

        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cal.getNum1()==-999999)
                    cal.setNum1(Double.parseDouble(TextDisplay.getText()));
                else
                    cal.setNum2(Double.parseDouble(TextDisplay.getText()));
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double  result = 0;
                if(cal.getFunction().equals("Add")) {
                    result = cal.Add(cal.getNum1(), cal.getNum2());
                }
                if(cal.getFunction().equals("Subtract"))
                {
                    result = cal.Subtract(cal.getNum1(), cal.getNum2());
                }
                if(cal.getFunction().equals("Multiply"))
                {
                    result = cal.Multiply(cal.getNum1(), cal.getNum2());
                }
                if(cal.getFunction().equals("Divide"))
                {
                    result = cal.Divide(cal.getNum1(), cal.getNum2());
                }
                TextDisplay.setText(cal.toString() + result);
            }
        });

        clearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.setNum1(-999999);
                cal.setNum2(-999999);
                cal.setFunction("");
                TextDisplay.setText("");
            }
        });

        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.setFunction("Add");
                TextDisplay.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.setFunction("Subtract");
                TextDisplay.setText("");
            }
        });
        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.setFunction("Multiply");
                TextDisplay.setText("");
            }
        });
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal.setFunction("Divide");
                TextDisplay.setText("");
            }
        });
        Dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorLayout");
        frame.setContentPane(new CalculatorLayout().CalPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
