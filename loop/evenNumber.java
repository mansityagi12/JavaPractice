package loop;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 30;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        sc.close();
    }
}
