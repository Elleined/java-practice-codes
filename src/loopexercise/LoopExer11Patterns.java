package loopexercise;

public class LoopExer11Patterns {
    
    // Ascending to Descending
    protected void pattern1(int num){
        for (int i = 1; i <= num; i++){
           for (int j = 1; j <= i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    
    // Descending to Ascending
    protected void pattern2(int num){
        for (int row = 1; row <= num; row++){
           for (int col = num; col >= row; col--){
               System.out.print("* ");
           }
        System.out.println();
       }
    }
    
    // 5x5 output
    protected void pattern3(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= num; col++){
                System.out.print("* ");
            }
        System.out.println();   
        }
    }
    
    // Ascending to Descending in numbers
    protected void pattern4(int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
        System.out.println();   
        }
    }
    
    // Both Ascending to Descending, Descending to Ascending
    protected void pattern5(int num){
        for (int row = 0; row < 2 * num; row++) {
            int totalIsInrow = row > num ? 2 * num - row: row;
            for (int col = 0; col < totalIsInrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    protected void print(int num){
        System.out.print(num);
    }
    
    // Diamond
    protected void pattern6(int num){
        for (int row = 1; row <= num ; row++) { //This is the row lines
            for (int col = 1 ; col < row; col++) {
                System.out.print(" ");
            }
            
            // Responsible for printing the 2nd output
                for (int col1 = num; col1 >= row; col1--) { 
                    System.out.print("* ");
                } 
        System.out.println();
        }        
    }

    // Both Descending to Ascending, Ascending to Descending
    protected void pattern7(int num){
        
        // Responsible for the spaces in 1st output
        // Also responsible for printing spaces in 1st output
        for (int row = 1; row <= num; row++) { //This is how many row lines
            for (int col = num - 1 ; col >= row; col--) {//Responsible for printing the spaces in 1st output 
                System.out.print(" ");
                System.out.print(" ");    
            }
            // Responsible for printing the 1st output
            for (int row1 = row ; row1 <= row ; row1++) { //This is how many row lines
                for (int col1 = 1; col1 <= row; col1++) { //Responsible for printing the 1st output
                    System.out.print("*" + " ");
                }    
            }
        System.out.println();
        }
       
        // Responsible for printing spaces in 2nd output
        for (int row2 = 1; row2 <= num - 1 ; row2++) { //This is the row lines
            for (int col = 1 ; col < row2; col++) { //Responsible for printing spaces in 2nd output
                System.out.print("  ");
            }
                // Responsible for printing the 2nd output
                for (int col1 = row2; col1 <= row2; col1++) { //This is the row lines
                    System.out.print("  "); // Used to adjust the space 
                    for (int col = num - 1; col >= row2 ; col--) { // Responsible for printing the 2nd output
                        System.out.print("* ");
                    }
                } 
        System.out.println();
        } 
    }

}
