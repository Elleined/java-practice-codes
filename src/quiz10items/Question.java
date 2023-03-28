package quiz10items;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Question {
    private enum Choices {A, B, C, D}
    private int numberOfCorrectAns;
    private int numberOfWrongAns;
    public Question() {
        item_1();
        item_2();
        item_3();
        item_4();
        item_5();
        item_6();
        item_7();
        item_8();
        item_9();
        item_10();
        totalScore();
    }

    private void displayChoices(Character answer, String... strings) {
        List<String> stringChoices = Arrays.asList(strings);
        List<Choices> choices = Arrays.asList(Choices.values());
        Iterator<Choices> i2 = choices.iterator();
        Iterator<String> i1 = stringChoices.iterator();
        HashMap<Choices, String> m = new HashMap<>();
        while (i2.hasNext() || i1.hasNext()) {
            m.put(i2.next(), i1.next());
        }
        // Use of TreeMap to sort choices
        TreeMap<Choices, String> sorted = new TreeMap<>(m);
        sorted.forEach((choices1, s) -> System.out.println(choices1 + ".  " + s));
        chooseAnswer(answer);
    }

    private void chooseAnswer(Character answer) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Choose answer: ");
            char selectedAnswer = in.nextLine().charAt(0);
            BiPredicate<Character, Character> correctAns = (ans, selectedAns) -> selectedAns == Character.toUpperCase(ans)
                        || selectedAns == Character.toLowerCase(ans);
            String decision = correctAns.test(answer, selectedAnswer) ? "Correct!" : "Wrong!";
            numberOfCorrectAns += correctAns.test(answer, selectedAnswer) ? 1 : 0;
            numberOfWrongAns += correctAns.test(answer, selectedAnswer) ? 0 : 1;
            System.out.printf("%c is %s%n", selectedAnswer, decision);
            Thread.sleep(700);
        } catch (InputMismatchException e) {
            System.out.println("Error Catch! " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void totalScore() {
        System.out.println("\nCorrect answers: " + numberOfCorrectAns);
        System.out.println("Wrong answers: " + numberOfWrongAns);
        String remark = numberOfCorrectAns >= 7 ? "Passed!" : "Failed!";
        System.out.printf("You got %d correct answer and you're remark is %s", numberOfCorrectAns, remark);
    }

    private void item_1() {
        System.out.println("1. What is a correct syntax to output \"Hello World\" in Java?");
        displayChoices('A',"System.out.println(\"Hello World\");",
                "Console.WriteLine(\"Hello World\")",
                "echo(\"Hello World\")",
                "print(\"Hello World\")"
        );
    }

    private void item_2() {
        System.out.println("\n2. How do you insert COMMENTS in Java code?");
        displayChoices('B', "/* This is a comment",
                "// This is a comment",
                "# This is a comment",
                "<!-- This is a comment -->"
        );
    }

    private void item_3() {
        System.out.println("\n3. Which data type is used to create a variable that should store text?");
        displayChoices('D', "string", "Txt", "myString", "String");
    }

    private void item_4() {
        System.out.println("\n4. How do you create a variable with the numeric value 5?");
        displayChoices('D', "num x = 5", "x = 5", "float x = 5", "int x = 5");
    }

    private void item_5() {
        System.out.println("\n5. How do you create a variable with the floating number 2.8?");
        displayChoices('C', "x = 2.8f", "byte x = 2.8f", "float x = 2.8f", "int x = 2.8f");
    }

    private void item_6() {
        System.out.println("\n6. Which method can be used to find the length of a string?");
        displayChoices('A', "length()", "getLength()", "len()", "getSize");
    }

    private void item_7() {
        System.out.println("\n7. Which operator is used to add together two values?");
        displayChoices('B', "The * sign", "The + sign", "The & sign", "The / sign");
    }

    private void item_8() {
        System.out.println("\n8. Which method can be used to return a string in upper case letters?");
        displayChoices('B', "upperCase()", "toUpperCase()", "upper()", "touppercase()");
    }

    private void item_9() {
        System.out.println("\n9. Which operator can be used to compare two values?");
        displayChoices('C', "> <", "=", "==", "< >");
    }

    private void item_10() {
        System.out.println("\n10. To declare an array in Java, define the variable type with:");
        displayChoices('A', "[]", "{}", "()", "<>");
    }
}
