package lambdaexpressionexample.nonterminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class Sorted {

    public Sorted() {
        List<User> people = MethodReferenceHelper.generateUserList();
        System.out.println("\nSample output of sorted: ");
        System.out.println("List sorted by name: ");
        people.stream()
                .sorted(MethodReferenceHelper::sortByName)
                .forEach(System.out::println);

        System.out.println("\nList sorted by age");
        people.stream()
                .sorted(MethodReferenceHelper::sortByAge)
                .forEach(System.out::println);

        System.out.println("\nList sorted by salary");
        people.stream()
                .sorted(MethodReferenceHelper::sortBySalary)
                .forEach(System.out::println);

        System.out.println("!!!Conclusion sorted is used to sort collections based on your own logic");
    }
}
