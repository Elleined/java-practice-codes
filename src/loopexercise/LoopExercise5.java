package loopexercise;

import java.util.Scanner;

// Display String return of Integer input
public class LoopExercise5 {

    public LoopExercise5() {
        Scanner in = new Scanner(System.in);
        boolean isNegative = true;
        
        System.out.print("Enter a Integer: ");
        String input = in.nextLine();
        
        int[] array = new int[input.length()];
        
        for(int i = 0; i < input.length(); i++){
        array[i] = Integer.parseInt(Character.toString(input.charAt(i))); 
        System.out.print(array[i] + " " );
        }
    }
}
