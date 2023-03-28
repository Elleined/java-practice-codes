package lambdaexpressionexample.terminaloperation;

import lambdaexpressionexample.MethodReferenceHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Count {

    public Count() {
        System.out.println("\nSample output of count: ");
        List<Integer> numbers = new ArrayList<>();
        Random randomNumber = new Random();
        int randomNumberRange = randomNumber.nextInt(2000, 5000);
        for (int i = 0; i <= randomNumberRange; i++) {
            numbers.add(i);
        }
        System.out.println("Random number range generated: " + randomNumberRange);
        long numberOfEvenNumbers = numbers.stream().filter(MethodReferenceHelper::evenNumber).count();
        long numberOfOddNumbers = numbers.stream().filter(MethodReferenceHelper::oddNumber).count();
        System.out.println("Total even numbers: " + numberOfEvenNumbers);
        System.out.println("Total odd numbers: " + numberOfOddNumbers);

        System.out.println("!!!Conclusion: count method is used to count the size of " +
                "ongoing process of stream");
    }
}
