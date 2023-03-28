package lambdaexpressionexample.nonterminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

public class TakeWhile {

    public TakeWhile() {
        List<User> userList = MethodReferenceHelper.generateUserList();
        System.out.println("Original salary stream: ");
        userList.stream()
                .map(User::salary)
                .forEach(System.out::println);
        System.out.println("\nSample output of takeWhile: " + "salary -> salary != 10000");
        userList.stream()
                .map(User::salary)
                .takeWhile(MethodReferenceHelper::notEqualTo10000)
                .forEach(System.out::println);
        System.out.println("As you can see takeWhile take all the values until condition is met" +
                " you can simply think takeWhile will take all the values from left");
    }
}
