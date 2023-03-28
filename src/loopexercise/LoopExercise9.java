package loopexercise;

import java.util.Scanner;

// Display Reverse (String) Input by charAt (0)
public class LoopExercise9 {
    
    public LoopExercise9(){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter an String: ");
       String name = in.nextLine();
       String reverse = "";
       for (int i = name.length()-1; i >= 0; i--){
           System.out.print(name.charAt(i) + " ");
       }
    }

}