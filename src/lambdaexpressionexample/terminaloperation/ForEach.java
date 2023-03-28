package lambdaexpressionexample.terminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class ForEach {

    public ForEach() {
        System.out.println("Sample output of forEach: ");
        List<User> people = MethodReferenceHelper.generateUserList();
        people.forEach(System.out::println);
        System.out.println("!!!Conclusion: forEach takes a parameter of Consumer");
    }
}
