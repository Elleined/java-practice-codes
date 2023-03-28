package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.Collections;
import java.util.List;

public class Limit {

    public Limit() {
        System.out.println("Sample output of limit: ");
        List<User> people = MethodReferenceHelper.generateUserList();
        Collections.shuffle(people);
        people.stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("!!!Conclusion: limit is use to limit the number of " +
                "object/ elements that will be process in stream");
    }
}
