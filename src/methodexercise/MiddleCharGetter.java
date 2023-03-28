package methodexercise;

import java.util.Scanner;

// Display middle character in the string
public class MiddleCharGetter {
    String name;
    
    void enterString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        this.name = in.nextLine();
    }
    
    void displayMiddleCharacter(){
       this.enterString();
       // odd 1, 3, 5
       int odd = name.length() / 2;
       if (name.length() % 2 == 1){
           System.out.println("The middle character in the string is: " + name.charAt(odd));
       }
       // even 2, 4, 6
       else{
           System.out.println("The middle character in the string is: " +  name.charAt(odd - 1) + name.charAt(odd));
       }
    }
    
    public MiddleCharGetter(){
       this.displayMiddleCharacter();
    } 
}
