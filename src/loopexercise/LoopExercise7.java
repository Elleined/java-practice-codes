package loopexercise;

import java.util.Scanner;

// Fibonacci Recursion
public class LoopExercise7 {

    public LoopExercise7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Fibonacci nth: ");
        int n = in.nextInt();
        int loop = n - 2;
        int v1 = 1;
        int v2 = 1;
        int ans = 0;
        
        for (int i = 1; i <= n - 2; i++){
            ans = v1 + v2;
            v1 = v2;
            v2 = ans;      
        }
        System.out.println("Result is: "  + (ans == 0 ? 1 : ans));
        
        
        
        
    }
    
}
