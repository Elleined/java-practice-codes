package lambdaexpressionexample.terminaloperation;
import lambdaexpressionexample.MethodReferenceHelper.*;
import lambdaexpressionexample.MethodReferenceHelper;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max {

    public Max() {
        System.out.println("Sample output of max: ");
        List<User> people = MethodReferenceHelper.generateUserList();
        Optional<User> maximumUserName = people.stream().max(Comparator.comparing(User::name));
        System.out.println("Maximum user based on name: " + maximumUserName);

        Optional<User> maximumUserSalary = people.stream().max(Comparator.comparingInt(User::salary));
        System.out.println("Maximum user based on salary: " + maximumUserSalary);

        Optional<User> maximumUserAge = people.stream().max(Comparator.comparingInt(User::age));
        System.out.println("Maximum user based on age: " + maximumUserAge);

        System.out.println("!!!Conclusion: get the max value base on your comparator");
    }
}
