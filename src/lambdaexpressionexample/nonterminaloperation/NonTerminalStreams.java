package lambdaexpressionexample.nonterminaloperation;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;
import java.util.*;
import java.util.Collection;
import java.util.List;

// filter == Predicate
// forEach == Consumer
// map == Function
// sorted == Comparator

public class NonTerminalStreams {

    public NonTerminalStreams() {
        flatMap();
    }

    public void flatMap() {
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
        System.out.println("\nSample output of flatMap: ");
        System.out.println("!!!Here we flattens/ group all the collection into one collection");
        availableEmployee.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        List<User> availableEmployeeList = filter(availableEmployee);
        System.out.println("""
                !!!Conclusion: flapMap is used for transformation and flattening of group of collection into 1
                collection and returns a stream of object which means flatMap is one to many unlike map that one to one
                """);
        limit(availableEmployeeList);
        sorted(availableEmployeeList);
    }

    private List<User> filter(List<List<User>> availableEmployee) {
        return new ArrayList<>(availableEmployee.stream()
                .flatMap(Collection::stream)
                .filter(MethodReferenceHelper::ageBetween22To23).toList());
    }

    private void limit(List<User> availableEmployeeList) {
        System.out.println("Sample output of limit: ");
        System.out.println("!!!Here we generated a random 5 employee from each team: ");
        Collections.shuffle(availableEmployeeList);
        List<User> mainTeam = availableEmployeeList.stream().limit(5).toList();
        mainTeam.stream()
                .map(MethodReferenceHelper::nameToUpperCase)
                .forEach(System.out::println);

        System.out.println("!!!Conclusion: limit is use to limit the number of " +
                "object/ elements that will be process in stream");
        map(mainTeam);
    }

    private void map(List<User> mainTeam) {
        System.out.println("\nSample output of map: ");
        System.out.println("!!!Here the selected 5 employee will get a salary increase of 5000");
        mainTeam.stream()
                .map(MethodReferenceHelper::salaryIncrease)
                .forEach(MethodReferenceHelper::displaySalaryIncrease);
        System.out.println("!!!Conclusion: map is used to apply certain on each and every " +
                "object/ element in one collection stream");
    }

    private void sorted(List<User> availableEmployeeList) {
        System.out.println("\nSample output of sorted: ");
        System.out.println("List sorted by name: ");
        availableEmployeeList.stream()
                .sorted(MethodReferenceHelper::sortByName)
                .forEach(System.out::println);

        System.out.println("\nList sorted by age");
        availableEmployeeList.stream()
                .sorted(MethodReferenceHelper::sortByAge)
                .forEach(System.out::println);

        System.out.println("\nList sorted by salary");
        availableEmployeeList.stream()
                .sorted(MethodReferenceHelper::sortBySalary)
                .forEach(System.out::println);

        System.out.println("!!!Conclusion sorted is used to sort collections based on your own logic");
    }
}
