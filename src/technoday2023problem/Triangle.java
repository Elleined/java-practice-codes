package technoday2023problem;

import java.util.Scanner;

class Triangle implements Shape {
    @Override
    public void draw() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Triangle Lenght: ");
        int lenght = in.nextInt();
        for (int i = 0; i < lenght; i++) {
            for (int j = i; j < lenght; j++) {
                System.out.print(' ');
            }

            for (int r = 0; r <= i; r++) {
                System.out.print('*');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
