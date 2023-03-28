package loopexercise;

import java.util.Scanner;

// Prime or Not 
// ? Question Mark and, : Semicolon
// Boolean use
public class LoopExercise3 {
    
    public LoopExercise3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num/2; i++){
            
            if (num % i == 0){
                System.out.print(i + " ");
                sum += i;
            }
        }  
        System.out.println("= " + sum);
        System.out.println(sum == 1 ? "Prime" : "Not Prime");
        
    }
}
