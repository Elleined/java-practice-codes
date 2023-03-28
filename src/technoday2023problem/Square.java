package technoday2023problem;

import java.util.Scanner;

class Square implements Shape {
    @Override
    public void draw() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Square Lenght: ");
        int lenght = in.nextInt();
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
