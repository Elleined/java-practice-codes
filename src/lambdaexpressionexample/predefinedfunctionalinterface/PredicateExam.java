package lambdaexpressionexample.predefinedfunctionalinterface;

import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;
import java.util.function.Predicate;

// Predicate ---> one parameter that returns boolean
// Use only if you have conditional statement in your program
public class PredicateExam {
    {
        System.out.println("-----Predicate Example-----");
    }

    public PredicateExam(){
        List<User> people = MethodReferenceHelper.generateUserList();
        Predicate<User> isNameValid = user -> user.name().length() > 4;
        Predicate<User> isNameMatched = user -> user.name().equals("Denielle");
        Predicate<User> isSalaryEnough = user -> user.salary() >= 20000;
        people.forEach(System.out::println);
        System.out.println("and() method");
        // and()
        for (User u: people){
            if (isNameValid.and(isNameMatched).test(u)){
                System.out.println(u);
            }
        }
        System.out.println("or() method");
        // or()
        for (User u: people){
            if (isNameValid.or(isNameMatched).test(u)){
                System.out.println(u);
            }
        }
        System.out.println("negate() method");
        // negate()
        for (User u: people){
            if (isSalaryEnough.negate().test(u)){
                System.out.println(u);
            } else {
                System.out.println("No output");
            }
        }

    }
}
