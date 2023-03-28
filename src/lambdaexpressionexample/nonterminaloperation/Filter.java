package lambdaexpressionexample.nonterminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class Filter {

    public Filter() {
        List<User> people = MethodReferenceHelper.generateUserList();
        System.out.println("Sample output of filter: " + " user.age() >= 22 && user.age() <= 23");
        people.stream()
                .filter(MethodReferenceHelper::ageBetween22To23)
                .sorted(MethodReferenceHelper::sortByAge)
                .forEach(System.out::println);
        System.out.println("As you can see we are simply filtering then getting all the user that are between 22 to 23");
    }
}
