package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class DropWhile {

    public DropWhile() {
        List<User> userList = MethodReferenceHelper.generateUserList();
        System.out.println("Original salary stream: ");
        userList.stream()
                .map(User::salary)
                .forEach(System.out::println);
        System.out.println("\nSample outout of dropWhile: " + "salary -> salary != 10000");
        userList.stream()
                .map(User::salary)
                .dropWhile(MethodReferenceHelper::notEqualTo10000)
                .forEach(System.out::println);
        System.out.println("As you can see dropWhile will drop all the values until condition is met" +
                " you can simply think dropWhile will take all the values from right");
    }
}
