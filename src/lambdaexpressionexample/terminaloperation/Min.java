package lambdaexpressionexample.terminaloperation;
import lambdaexpressionexample.MethodReferenceHelper.*;
import lambdaexpressionexample.MethodReferenceHelper;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min {

    public Min() {
        System.out.println("Sample output of min: ");
        List<User> people = MethodReferenceHelper.generateUserList();
        Optional<User> minimumUserName = people.stream().min(Comparator.comparing(User::name));
        System.out.println("Minimum user based on name: " + minimumUserName);

        Optional<User> minimumUserSalary = people.stream().min(Comparator.comparingInt(User::salary));
        System.out.println("Minimum user based on salary: " + minimumUserSalary);

        Optional<User> minimumUserAge = people.stream().min(Comparator.comparingInt(User::age));
        System.out.println("Minimum user based on age: " + minimumUserAge);

        System.out.println("!!!Conclusion: get the min value base on your comparator");
    }
}
