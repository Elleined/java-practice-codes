package loopexercise;

import java.util.Scanner;

public class LoopExercises {
    // Global Variable
    String loopNum = "Enter LoopExercise 2 - 11: ";
    
    // LoopExercises Constructors
    // Constructor
    public LoopExercises(){
        Scanner in = new Scanner(System.in);
        System.out.print(loopNum);
        int num = in.nextInt();
        String loopTitle = "LoopExercise Title: ";
        while (num <= 11){
                    
            if (num == 2){
                System.out.println(loopTitle + "\"Break and Continue\"");
                new LoopExercise2();
                System.out.print("\n" + loopNum);
                num = in.nextInt();
            }
            else if (num == 3){
                System.out.println(loopTitle + "\"Prime or Not (Displays Modulo)\" ");
                new LoopExercise3();
                System.out.print("\n" + loopNum);
                num = in.nextInt();
            }
            else if (num == 4){
                System.out.println(loopTitle +"\"Prime or Not\" ");
                new LoopExercise4();
                System.out.print("\n" + loopNum);
                num = in.nextInt();
            }
            else if (num == 5){
                System.out.println(loopTitle + "\" Display String return of Integer input\" ");
                new LoopExercise5();
                System.out.print("\n" + "\n" + loopNum);
                num = in.nextInt();
            }    
            else if (num == 6){
                System.out.println(loopTitle + "\"Single Line Addition (n[0] + n[1] and so on...\" ");
                new LoopExercise6();
                System.out.print("\n" + loopNum);
                num = in.nextInt();
            } 
            else if (num == 7){
                System.out.println(loopTitle + "\"Fibonacci Recursion\" ");
                new LoopExercise7();
                System.out.print("\n" + loopNum);
                num = in.nextInt();
            }    
            else if (num == 8){
                System.out.println(loopTitle + "\"Display (String) Input by charAt (0)\" ");
                new LoopExercise8();
                System.out.print("\n" + "\n" + loopNum);
                num = in.nextInt();
            } 
            else if (num == 9){
                System.out.println(loopTitle + "\"Display Reverse (String) Input by charAt (0)\" ");
                new LoopExercise9();
                System.out.print("\n" + "\n" + loopNum);
                num = in.nextInt();
            }
            else if (num == 10){
                System.out.println(loopTitle + "\"Detect Palindrome or Not (String)\" ");
                new LoopExercise10();
                System.out.print("\n" + "\n" + loopNum);
                num = in.nextInt();
            }
            else if (num == 11){
                System.out.println(loopTitle + "\"Number Patterns\" ");
                new LoopExercise11();
                System.out.print("\n"+ loopNum);
                num = in.nextInt();
            }
            else {
                break;
            }
        }
    }

}
