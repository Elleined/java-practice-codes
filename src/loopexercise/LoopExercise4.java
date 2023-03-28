package loopexercise;

import java.util.Scanner;

// Prime or Not
public class LoopExercise4 {
    
    public LoopExercise4() {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter an Integer: ");
        int num = in.nextInt();
        int sum = 0;
        boolean isPrime = true;
       
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                isPrime = false;                
                break;
            }
            
        } 
        System.out.println(isPrime ? "Prime" : "Not prime");        
            
            
    }
}
