package ifelse;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");

        }
        sc.close();

    }
}
