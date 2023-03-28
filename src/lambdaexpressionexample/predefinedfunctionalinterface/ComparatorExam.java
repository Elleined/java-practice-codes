package lambdaexpressionexample.predefinedfunctionalinterface;
import lambdaexpressionexample.MethodReferenceHelper;
import lambdaexpressionexample.MethodReferenceHelper.*;

import java.util.List;

// For ascending
// if object1 > object2 return 1
// else if object1 < object2 return -1
// else object1 == object2 return 0
// if object1 > object2 return 1

// For descending
// if object1 > object2 return -1
// else if object1 < object2 return 1
// else object1 == object2 return 0
// if object1 > object2 return 1
public class ComparatorExam {

    public ComparatorExam() {
        List<User> people = MethodReferenceHelper.generateUserList();

        System.out.println("Sorted by Name");
//        Comparator<User> compareName = Comparator.comparing(User::getName);
        people.stream()
                .sorted(MethodReferenceHelper::sortByName)
                .forEach(System.out::println);

        System.out.println("\nSorted by Age");
//        Comparator<User> compareAge = Comparator.comparingInt(User::getAge);
        people.stream()
                .sorted(MethodReferenceHelper::sortByAge)
                .forEach(System.out::println);

        System.out.println("\nSorted  by Salary");
//        Comparator<User> compareSalary = Comparator.comparingInt(User::getSalary);
        people.stream()
                .sorted(MethodReferenceHelper::sortBySalary)
                .forEach(System.out::println);
    }
}
