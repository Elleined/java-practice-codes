package lambdaexpressionexample.predefinedfunctionalinterface;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

// Consumer ---> one parameter with no return type // in OOP this was void method
// Use only if you want process something
public class ConsumerExam {
    {
        System.out.println("-----Consumer Example-----");
    }

    public ConsumerExam() {
        List<User> people = MethodReferenceHelper.generateUserList();
        System.out.println("Original List: ");
        people.forEach(System.out::println);

        salaryIncrease(people);
    }

    void salaryIncrease(List<User> people) {
        System.out.println("\nLegible for salary increase: ");
        people.stream()
                .filter(user -> user.salary() >= 15000 && user.salary() < 30000)
                .map(MethodReferenceHelper::salaryIncrease)
                .forEach(MethodReferenceHelper::displaySalaryIncrease);

        System.out.println("\nIllegible for salary increase: ");
        people.stream()
                .filter(user -> !(user.salary() >= 15000 && user.salary() < 30000))
                .map(MethodReferenceHelper::salaryIncrease)
                .forEach(MethodReferenceHelper::displaySalaryIncrease);
    }
}
