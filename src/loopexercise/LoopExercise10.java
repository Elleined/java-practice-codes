package loopexercise;
import java.util.Scanner;

// Detects Palindrome or Not
public class LoopExercise10 {
    
    public LoopExercise10(){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter an String: ");
       String name = in.nextLine();
       String reverse = "";
       for (int i = name.length()-1; i >= 0; i--){
           reverse += name.charAt(i);
           
       }
       System.out.println(!name.equals(reverse) ?  
            name + " is not palindrome" : name + " is palindrome");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
