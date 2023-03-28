package lambdaexpressionexample.terminaloperation;

import java.util.List;
import java.util.Optional;

public class Reduce {

    public Reduce() {
        System.out.println("Sample output of reduce: ");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        System.out.print("Elements in list before combining them: ");
        numbers.forEach(System.out::print);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("\nAfter reducing it in one element: " + sum.get() + "\n");

        List<String> name = List.of("Denielle ", "Mar ", "M. ","De Guzman");
        System.out.print("Elements in list before combining them: ");
        name.forEach(System.out::print);
        Optional<String> fullName = name.stream().reduce((t, s) -> t + s);
        System.out.println("\nAfter reducing it in one element: " + fullName.get());
        System.out.println("!!!Conclusion: reduce method combine all the elements within its own collection in one object");
    }
}
