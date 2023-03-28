package loopexercise;

import java.util.Scanner;

// Display (String) Input by charAt (0)
public class LoopExercise8 {

    public LoopExercise8() {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter an String: ");
       String name = in.nextLine();
       
       char[] names = new char [name.length()];
        
       for (int i = 0; i <= name.length()-1; i++){
           names[i] = name.charAt(i);
           System.out.print(names[i] + " ");
       }
    
       
       
       
       
       
       
    }

   
}
