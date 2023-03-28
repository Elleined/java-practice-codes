package lambdaexpressionexample.terminaloperation;
import lambdaexpressionexample.MethodReferenceHelper.*;
import lambdaexpressionexample.MethodReferenceHelper;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

    public Collect() {
        System.out.println("Sample output of Collect: ");
        List<User> people = MethodReferenceHelper.generateUserList();
        List<User> playersList = people.stream().limit(5).toList();
        Set<User> playersSet = people.stream().limit(5).collect(Collectors.toSet());

        playersList.forEach(System.out::println);
        playersSet.forEach(System.out::println);

        System.out.println("!!!Conclusion: collect method collects the process elements into another list");
    }
}
