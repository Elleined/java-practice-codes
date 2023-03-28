package technoday2023problem;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String yesOrNo;

        try (Scanner letter = new Scanner(System.in);
             Scanner digit = new Scanner(System.in)
        ) {

            do {
                System.out.println(Main.displaySelection());
                System.out.print("Enter Shape Code: ");

                int selectedCodeShape = digit.nextInt();
                Shape shape;
                if (selectedCodeShape == 1) shape = new Circle();
                else if (selectedCodeShape == 2) shape = new Square();
                else if (selectedCodeShape == 3) shape = new Triangle();
                else throw new IllegalArgumentException("Select only between 1 to 3!");
                shape.draw();

                System.out.print("Do you want to continue? Y/N : ");
                yesOrNo = letter.nextLine();
                System.out.println("---------------------");
            } while(yesOrNo.equalsIgnoreCase("Y"));
        } catch(InputMismatchException e) {
            System.out.println("Error input mismatch cannot proceed!");
        }
        System.out.println("Ended!!!!!!");
    }

    public static String displaySelection() {
        return """
                Shape Code:
                1 = Circle
                2 = Square
                3 = Triangle""";
    }
}
