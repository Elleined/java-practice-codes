package calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.function.BiFunction;

public class Calculator {
    private static Calculator calculatorInstance;

    private final CalculatorGUI calculatorGUI = CalculatorGUI.getCalculatorGUIInstance();
    private static final List<Double> numberIntegerList = new ArrayList<>();
    private static final List<String> numberStringList = new ArrayList<>();

    private Calculator() {
        calculatorGUI.getBtn0().addActionListener(this::numberPressed);
        calculatorGUI.getBtn1().addActionListener(this::numberPressed);
        calculatorGUI.getBtn2().addActionListener(this::numberPressed);
        calculatorGUI.getBtn3().addActionListener(this::numberPressed);
        calculatorGUI.getBtn4().addActionListener(this::numberPressed);
        calculatorGUI.getBtn5().addActionListener(this::numberPressed);
        calculatorGUI.getBtn6().addActionListener(this::numberPressed);
        calculatorGUI.getBtn7().addActionListener(this::numberPressed);
        calculatorGUI.getBtn8().addActionListener(this::numberPressed);
        calculatorGUI.getBtn9().addActionListener(this::numberPressed);

        calculatorGUI.getBtnMultiply().addActionListener(this::btnOperationPressed);
        calculatorGUI.getBtnDivide().addActionListener(this::btnOperationPressed);
        calculatorGUI.getBtnAdd().addActionListener(this::btnOperationPressed);
        calculatorGUI.getBtnSubtract().addActionListener(this::btnOperationPressed);

        calculatorGUI.getBtnEqual().addActionListener(this::equalPressed);
        calculatorGUI.getBtnClear().addActionListener(this::clearPressed);
        calculatorGUI.getBtnRemove().addActionListener(this::removePressed);
        calculatorGUI.getBtnPeriod().addActionListener(this::periodPressed);
        calculatorGUI.getTfAnswer().requestFocus();
    }

    private void btnOperationPressed(ActionEvent operationPressed) {
        // for displaying numbers
        Optional<String> operations = getBtnOperations().stream()
                .filter(jButton -> operationPressed.getSource() == jButton)
                .map(JButton::getText)
                .findFirst();
        String op = String.valueOf(operations.orElse(null));
        StringJoiner joiner = new StringJoiner(op, "", op);
        joiner.add(calculatorGUI.getTfAnswer().getText());
        calculatorGUI.getTfAnswer().setText(String.valueOf(joiner));
        // for the actual operation
        convert();
        if (numberIntegerList.size() > 1) {
            performOperation(op);
        }
        System.out.println("string: " + numberStringList);
        System.out.println("integers: " + numberIntegerList);
    }

    private void performOperation(String operation) {
        double tempNumber;
        BiFunction<Double, Double, Double> times = (t, s) -> t * s;
        if (operation.equals("÷")) {
            tempNumber = numberIntegerList.stream().reduce(0.0, (t, s) -> s / t);
            System.out.println("divide");
        }
        else if (operation.equals("x")) {
            tempNumber = numberIntegerList.stream().reduce(0.0, times, (t, s) -> t * s);
            System.out.println("temp number: " + tempNumber);
            System.out.println("times");
        }
        else if (operation.equals("+")) {
            tempNumber = numberIntegerList.stream().reduce(0.0, Double::sum);
            System.out.println("plus");
        }
        else {
            tempNumber =  numberIntegerList.stream().reduce(0.0, (t, s) -> s - t);
            System.out.println("minus");
        }
        System.out.println("sample: " + times.apply(10.0, 5.0));
        numberIntegerList.clear();
        numberIntegerList.add(tempNumber);
        System.out.println(" !!!! " + tempNumber );
    }

    private void numberPressed(ActionEvent numberPressed) {
        List<JButton> btnNumberList = getBtnNumbers();
        Optional<Integer> values = btnNumberList.stream()
                .filter(jButton -> numberPressed.getSource() == jButton)
                .map(JButton::getText)
                .map(Integer::parseInt)
                .findFirst();
        String value = String.valueOf(values.orElse(null));
        StringJoiner joiner = new StringJoiner("");
        joiner.add(calculatorGUI.getTfAnswer().getText());
        joiner.add(value);
        calculatorGUI.getTfAnswer().setText(String.valueOf(joiner));

        numberStringList.add(String.valueOf(value)); // adding the number here then reducing it and converting it into integer in operation pressed
    }

    private void equalPressed(ActionEvent equalPressed) {
        convert();
        Double total = numberIntegerList.stream().reduce(0.0, Double::sum); // flattening numberIntegerList
        numberIntegerList.clear(); // clearing the numberInteger for only the total will remain
        numberIntegerList.add(total); // adding the total that will only number that will remain in numberIntegerList
        calculatorGUI.getTfAnswer().setText(String.valueOf(total)); // setting the total in screen
        System.out.println("string: " + numberStringList);
        System.out.println("integers: " + numberIntegerList);
    }

    private void clearPressed(ActionEvent clearPressed) {
        numberStringList.clear();
        numberIntegerList.clear();
        calculatorGUI.getTfAnswer().setText(null);
        System.out.println("clear pressed");
    }

    private void removePressed(ActionEvent removePressed) {
        calculatorGUI.getTfAnswer().setText(""+ calculatorGUI.getTfAnswer().getText().substring(0,  calculatorGUI.getTfAnswer().getText().length() - 1));
        // caret try here

        System.out.println("remove pressed");
    }

    private void periodPressed(ActionEvent periodPressed) {
        System.out.println("period pressed");
    }

    private void convert() {
        Optional<String> numberEntered = numberStringList.stream().reduce((t, s) -> t + s);
        try {
            numberIntegerList.add(Double.valueOf(Objects.requireNonNull(numberEntered.orElse(null))));
        } catch (NullPointerException e) {
            System.out.println("its okay");
        }
        numberStringList.clear();
    }

    private List<JButton> getBtnNumbers() {
        return Arrays.asList(
                calculatorGUI.getBtn0(),
                calculatorGUI.getBtn1(),
                calculatorGUI.getBtn2(),
                calculatorGUI.getBtn3(),
                calculatorGUI.getBtn4(),
                calculatorGUI.getBtn5(),
                calculatorGUI.getBtn6(),
                calculatorGUI.getBtn7(),
                calculatorGUI.getBtn8(),
                calculatorGUI.getBtn9());
    }

    private List<JButton> getBtnOperations() {
        return Arrays.asList(
                calculatorGUI.getBtnMultiply(),
                calculatorGUI.getBtnDivide(),
                calculatorGUI.getBtnAdd(),
                calculatorGUI.getBtnSubtract());
    }

    static Calculator getCalculatorInstance() {
        if (calculatorInstance == null) calculatorInstance = new Calculator();
        return calculatorInstance;
    }
}
