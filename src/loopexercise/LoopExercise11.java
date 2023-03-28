package loopexercise;

import java.util.Scanner;

public class LoopExercise11 extends LoopExer11Patterns{

    static int getNum(int numInput){
        System.out.print("Choose pattern between 1 and 7: ");
        Scanner in = new Scanner(System.in);
        numInput = in.nextInt();
        return numInput;
    }
    
   static int loopNum(int loopNum){
       System.out.print("Enter an Integer for pattern output: ");
       Scanner in1 = new Scanner(System.in);
       loopNum = in1.nextInt();
       return loopNum;
   }
    
    public LoopExercise11(){
       LoopExer11Patterns patterns = new LoopExer11Patterns();
       int numInput = 0; // Number for choosing pattern design
       int loopNum = 0; // Number for pattern output
       numInput = getNum(numInput);
       do {
        if (numInput == 1){
           loopNum = loopNum(loopNum);
           patterns.pattern1(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 2){
           loopNum = loopNum(loopNum);
           patterns.pattern2(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 3){
           loopNum = loopNum(loopNum);
           patterns.pattern3(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 4){
           loopNum = loopNum(loopNum);
           patterns.pattern4(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 5){
           loopNum = loopNum(loopNum);
           patterns.pattern5(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 6){
           loopNum = loopNum(loopNum);
           patterns.pattern6(loopNum);
           numInput = getNum(numInput);
        }
        if (numInput == 7){
           loopNum = loopNum(loopNum);
           patterns.pattern7(loopNum);
           numInput = getNum(numInput);
        }
        else {
             break;
         }
       } while (numInput <= numInput);
    }
    /*
MATRIX NOTES

How to Approach
1. no. of line = no. of rows
= no.of time outer for loop will run

2. Identify for every row no.
* how many columns are there
* types of elements in columns

3. What do you need to print
* outer for loop System.out.println();

    Note: Try to find the formula relating the rows and columns    
*/
}
