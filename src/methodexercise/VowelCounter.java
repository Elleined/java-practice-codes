package methodexercise;
import java.util.Scanner;
    
// Vowel Counter
public final class VowelCounter {
    String name;
    String vowel;
    void enterString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = in.nextLine();
        this.name = name;
    }
    
    void vowelCounter(){
        this.enterString();
        char vowelArray;
        String b = "";
        String c = "";
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (name.charAt(i) == vowels[j]){
                   vowelArray = name.charAt(i);
                   String a = Character.toString(vowelArray); 
                   c = b+=a;
                }
                
            }
        }
        System.out.println("The total Vowels in the String is: " + c.length());
        }
        
    public VowelCounter(){
        this.vowelCounter();
    }   
       
        
        
    }
    
    
    
  
    
    
    
   

