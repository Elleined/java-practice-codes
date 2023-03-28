package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {

    public FlatMap() {
        System.out.println("\nSample output of flatMap: ");
        List<User> teamA = Arrays.asList(
                new User("Matthew", 21, Gender.MALE, 20000),
                new User("Christian", 22, Gender.MALE, 21000),
                new User("Denielle", 23, Gender.MALE, 22000),
                new User("Ruben", 24, Gender.MALE, 23000)
        );
        System.out.println("\nList of Team A: ");
        teamA.forEach(System.out::println);
        List<User> teamB = Arrays.asList(
                new User("Bentong", 21, Gender.MALE, 21000),
                new User("Ruby", 22, Gender.MALE, 22000),
                new User("Catherine", 23, Gender.FEMALE, 23000),
                new User("Hebrew", 24, Gender.MALE, 24000)
        );
        System.out.println("\nList of Team B: ");
        teamB.forEach(System.out::println);
        List<User> teamC = Arrays.asList(
                new User("Tenten", 21, Gender.FEMALE, 21000),
                new User("Robert", 22, Gender.MALE, 22000),
                new User("Kanal", 23, Gender.MALE, 23000),
                new User("Frederick", 24, Gender.MALE, 24000)
        );
        System.out.println("\nList of Team C: ");
        teamC.forEach(System.out::println);

        List<List<User>> availableEmployee = Arrays.asList(teamA, teamB, teamC);
        System.out.println("!!!Here we flattens/ group all the collection into one collection");
        availableEmployee.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        System.out.println("""
                !!!Conclusion: flapMap is used for transformation and flattening of group of collection into 1
                collection and returns a stream of object which means flatMap is one to many unlike map that one to one
                """);
    }
}
