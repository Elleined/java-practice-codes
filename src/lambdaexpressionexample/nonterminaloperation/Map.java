package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class Map {

    public Map() {
        System.out.println("Sample output of map: " + "user.salary() + 5000");
        List<User> people = MethodReferenceHelper.generateUserList();
        people.stream()
                .map(MethodReferenceHelper::salaryIncrease)
                .forEach(MethodReferenceHelper::displaySalaryIncrease);
        System.out.println("!!!Conclusion: map is used to apply certain on each and every " +
                "object/ element in one collection stream");
    }
}
