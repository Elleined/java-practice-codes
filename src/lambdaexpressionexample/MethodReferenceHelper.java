package lambdaexpressionexample;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public interface MethodReferenceHelper {

    enum Gender {
        MALE, FEMALE
    }

    record User(String name, Integer age, Gender gender, Integer salary) {}

    static List<User> generateUserList() {
        return Arrays.asList(
                new User("Denielle", 21, Gender.MALE, 20000),
                new User("Ruben", 22, Gender.MALE, 21000),
                new User("Josel", 22, Gender.MALE, 30000),
                new User("Bernard", 23, Gender.MALE, 15000),
                new User("Christina", 25, Gender.FEMALE, 10000),
                new User("Fermin", 21, Gender.FEMALE, 25000),
                new User("Angelica", 22, Gender.FEMALE, 18000)
        );
    }

    static boolean ageBetween22To23(User user) {
        return user.age() >= 22 && user.age() <= 23;
    }

    static String nameToUpperCase(User user) {
        return user.name().toUpperCase();
    }
    static Integer salaryIncrease(User user) {
        System.out.print(user.name() + " " + user.salary());
        return user.salary() + 5000;
    }
    static void displaySalaryIncrease(Integer salary) {
        System.out.println(" -> " + salary);
    }

    static int sortByAge(@NotNull User user1, User user2) {
        if (user1.age() > user2.age()) return 1;
        else if (user1.age() < user2.age()) return -1;
        else return 0;
    }

    static int sortByName(@NotNull User user1, User user2) {
        return user1.name().compareTo(user2.name());
    }

    static int sortBySalary(@NotNull User user1, User user2) {
        if (user1.salary() > user2.salary()) return 1;
        else  if (user1.salary() < user2.salary()) return -1;
        else return 0;
    }

    static boolean notEqualTo10000(int salary) {
        return salary != 10000;
    }
    static boolean startsWithD(String word) {
        return word.startsWith("D");
    }
    static boolean evenNumber(Integer number) {
        return number % 2 == 0;
    }
    static boolean oddNumber(Integer number) {
        return number % 2 == 1;
    }
}
