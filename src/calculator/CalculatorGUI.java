package calculator;
import javax.swing.*;

final class CalculatorGUI extends JFrame {
    private static CalculatorGUI calculatorGUIInstance;
    private final JTextField tfAnswer;
    private final JButton btnClear;
    private final JButton btnDivide;
    private final JButton btnMultiply;
    private final JButton btnRemove;
    private final JButton btn7;
    private final JButton btn8;
    private final JButton btn9;
    private final JButton btnSubtract;
    private final JButton btn4;
    private final JButton btn5;
    private final JButton btn6;
    private final JButton btnAdd;
    private final JButton btn3;
    private final JButton btn2;
    private final JButton btn1;
    private final JButton btn0;
    private final JButton btnPeriod;
    private final JButton btnEqual;

    private CalculatorGUI() {
        setTitle("Calculator");
        // Answer TextField
        tfAnswer = new JTextField();
        // Number Buttons
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        // Operation Buttons
        btnMultiply = new JButton("x");
        btnDivide = new JButton("÷");
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        // Other Buttons
        btnClear = new JButton("C");
        btnRemove = new JButton("<");
        btnPeriod = new JButton(".");
        btnEqual = new JButton("=");
        // Placing TextField
        tfAnswer.setBounds(10, 10, 255, 50);
        // Placing Number Buttons
            // Row 1
        btnClear.setBounds(10, 70, 50, 40);
        btnDivide.setBounds(78, 70, 50, 40);
        btnMultiply.setBounds(145, 70, 50, 40);
        btnRemove.setBounds(213, 70, 50, 40);
            // Row 2
        btn7.setBounds(10, 120, 50, 40);
        btn8.setBounds(78, 120, 50, 40);
        btn9.setBounds(145, 120, 50, 40);
        btnSubtract.setBounds(213, 120, 50, 40);
            // Row 3
        btn4.setBounds(10, 170, 50, 40);
        btn5.setBounds(78, 170, 50, 40);
        btn6.setBounds(145, 170, 50, 40);
        btnAdd.setBounds(213, 170, 50, 40);
            // Row 4
        btn1.setBounds(10, 220, 50, 40);
        btn2.setBounds(78, 220, 50, 40);
        btn3.setBounds(145, 220, 50, 40);
            // Row 5
        btn0.setBounds(10, 270, 120, 40);
        btnPeriod.setBounds(147, 270, 50, 40);
        btnEqual.setBounds(213, 220, 50, 90);
        // Adding components to frame
        add(tfAnswer);
        add(btnClear);add(btnDivide);add(btnMultiply);add(btnRemove);
        add(btn7);add(btn8);add(btn9);add(btnSubtract);
        add(btn4);add(btn5);add(btn6);add(btnAdd);
        add(btn1);add(btn2);add(btn3);
        add(btn0);add(btnPeriod);add(btnEqual);
        // Setting up JFrame
        setLayout(null);
        setSize(290, 360);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    static CalculatorGUI getCalculatorGUIInstance() {
        if (calculatorGUIInstance == null) calculatorGUIInstance = new CalculatorGUI();
        return calculatorGUIInstance;
    }

    JFrame getFrame() {
        return this;
    }
    JTextField getTfAnswer() {
        return tfAnswer;
    }
    JButton getBtnClear() {
        return btnClear;
    }
    JButton getBtnDivide() {
        return btnDivide;
    }
    JButton getBtnMultiply() {
        return btnMultiply;
    }
    JButton getBtnRemove() {
        return btnRemove;
    }
    JButton getBtn7() {
        return btn7;
    }
    JButton getBtn8() {
        return btn8;
    }
    JButton getBtn9() {
        return btn9;
    }
    JButton getBtnSubtract() {
        return btnSubtract;
    }
    JButton getBtn4() {
        return btn4;
    }
    JButton getBtn5() {
        return btn5;
    }
    JButton getBtn6() {
        return btn6;
    }
    JButton getBtnAdd() {
        return btnAdd;
    }
    JButton getBtn3() {
        return btn3;
    }
    JButton getBtn2() {
        return btn2;
    }
    JButton getBtn1() {
        return btn1;
    }
    JButton getBtn0() {
        return btn0;
    }
    JButton getBtnPeriod() {
        return btnPeriod;
    }
    JButton getBtnEqual() {
        return btnEqual;
    }
}
