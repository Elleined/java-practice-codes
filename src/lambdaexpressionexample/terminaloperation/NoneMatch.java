package lambdaexpressionexample.terminaloperation;

import javax.swing.*;
import java.util.stream.Stream;

public class NoneMatch {

    public NoneMatch() {
        System.out.println("Sample output of noneMatch: " + "s -> s.startsWith(\"R\")");
        Stream<String> people = Stream.of("Denielle", "David", "Dominic", "Diego", "Dylan");
        boolean noneMatch = people.peek(System.out::println).noneMatch(s -> s.startsWith("R"));
        System.out.println("No name starts with R: " + noneMatch);

        System.out.println("\n!!!Conclusion: noneMatch method returns true if none of the elements are match with the given " +
                "predicate this also is the reverse of allMatch");
        System.out.println("!!!Also you can think of noneMatch is \"not\" logical operator");
    }
}
