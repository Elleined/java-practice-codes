package lambdaexpressionexample.predefinedfunctionalinterface;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;
import java.util.function.Function;

// Function ---> one parameter that return any type // in OOP this was method with return type
// Use only if you want a return of any type
public class FunctionExam {

    public FunctionExam(){
        List<User> people = MethodReferenceHelper.generateUserList();
        Function<User, Integer> getAge = user -> user.salary() + 5000;
        for (User u: people) {
            System.out.printf("%s %d -> %d%n", u.name(), u.salary(), getAge.apply(u));
        }
    }
}
