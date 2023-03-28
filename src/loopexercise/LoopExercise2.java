package loopexercise;

import java.util.Scanner;

// Break and Continue = 100
public class LoopExercise2 {

    public LoopExercise2() {
        Scanner in = new Scanner(System.in);
        System.out.println("    Display \"Done.\" when sum exceeds 100  ");
        int firstNum, total = 0;
        do {
            System.out.print("\nEnter an Integer: " );
            firstNum = in.nextInt();
            if (firstNum == 0){
               break;
            }
            total += firstNum; 
                if (firstNum <= 100){
                    System.out.println("Total: " + total);
                }
                if (firstNum >= 100){
                    firstNum = total;
                    total = 0;
                    System.out.println("Please enter number between 1 and 99!");
                    continue;
                }   
                else if (total >= 100){
                    System.out.println();
                    System.out.println(total + " exceeds to 100. Done!");
                    break;
                }  
        } while(firstNum <= 100 || firstNum >= 100);  
    }
    
}
