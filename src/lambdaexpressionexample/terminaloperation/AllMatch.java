package lambdaexpressionexample.terminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;

import java.util.Optional;
import java.util.stream.Stream;

public class AllMatch {

    public AllMatch() {
        System.out.println("Sample output of allMatch: " + "s -> s.startsWith(\"D\")");
        Stream<String> people = Stream.of("Denielle", "David", "Dominic", "Diego", "Dylan");
        boolean allMatch = people.peek(System.out::println).allMatch(MethodReferenceHelper::startsWithD);
        System.out.println("All name starts with D: " + allMatch);

        System.out.println("!!!Conclusion: allMatch method returns true if and only if all elements match with" +
                "the given predicate otherwise false");
        System.out.println("!!!Also you can think of allMatch is \"and\" logical operator");
    }
}
