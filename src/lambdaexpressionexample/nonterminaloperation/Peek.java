package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class Peek {

    public Peek() {
        System.out.println("Sample output of peek: " + "user -> user.age() <= 22");
        List<User> people = MethodReferenceHelper.generateUserList();
        people.stream()
                .filter(user -> user.age() <= 22)
                .peek(System.out::println)
                .map(MethodReferenceHelper::salaryIncrease)
                .forEach(MethodReferenceHelper::displaySalaryIncrease);

        System.out.println("!!!Conclusion peek method is used for debugging from the name itself its for peeking " +
                "whats inside the stream during its operation");
    }
}
