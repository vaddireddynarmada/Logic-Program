import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        monthlyPayment();
    }

    public static void monthlyPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int y = sc.nextInt();
        System.out.println("Enter principle Loan : ");
        int p = sc.nextInt();
        System.out.println("Enter percent : ");
        int r = sc.nextInt();
        int n = 12 * y;
        int R = r / (12 * 100);
        float payment = (float) ((p * r) / (1 - Math.pow((1 + r), -n)));
        System.out.println(payment);
    }
}
