import java.util.*;

public class switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Januray");
                break;
            case 2:
                System.out.println("Feburary");
                break;
            case 3:
                System.out.println("March");

                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            default:
                System.out.println("invalid");
        }
        sc.close();

    }
}
