package loop;

import java.util.Scanner;

public class reverseHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}
