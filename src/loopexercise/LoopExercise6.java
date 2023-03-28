package loopexercise;

import java.util.Scanner;

// Single Line Addition (n[0] + n[1] and so on...
public class LoopExercise6 {
    
    public LoopExercise6() {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        
        int n = in.nextInt();
        int sum = 0;
        int total = 0;
        
        for (int i = 0; i <= n/10; i/=10){
            
            sum = n % 10;
            n = n / 10;
            total += sum;
            if (n <= 0){
                break;
            } 
            
            if (n == 0){
                break;
            }
        }
        System.out.println("Total is: " + total); 
        
    }
    
}
