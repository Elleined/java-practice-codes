package lambdaexpressionexample.predefinedfunctionalinterface;

public class RunnableExam {

    public RunnableExam() {
        Runnable run1 = () -> System.out.println("Hi im Runnable Functional Interface");
        Runnable run2 = () -> System.out.println("That commonly used in threads!");
        run1.run();
        run2.run();
    }
}
