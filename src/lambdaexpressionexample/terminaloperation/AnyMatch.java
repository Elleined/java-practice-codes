package lambdaexpressionexample.terminaloperation;
import lambdaexpressionexample.MethodReferenceHelper.*;
import lambdaexpressionexample.MethodReferenceHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AnyMatch {

    public AnyMatch() {
        System.out.println("Sample output of anyMatch: " + "s -> s.startsWith(\"D\")");
        Stream<String> people = Stream.of("Denielle", "Ruben", "Christina", "Rolanda", "Unicka");
        boolean anyMatch = people.peek(System.out::println).anyMatch(MethodReferenceHelper::startsWithD);
        System.out.println("Any name starts with D: " + anyMatch);
        System.out.println("!!!Conclusion: anyMatch method returns true if any of the element match with given predicate" +
                " otherwise false");
        System.out.println("!!!Also you can think of anyMatch is \"or\" logical operator");
    }
}
