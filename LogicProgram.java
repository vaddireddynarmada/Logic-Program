import java.util.Scanner;

public class LogicProgram {
    public static void main(String[] args) {
        LogicProgram lp = new LogicProgram();
        lp.perfectNumber();
    }

    public void perfectNumber() {
        System.out.println("Perfect Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("perfect number");
        } else {
            System.out.println("not");
        }
    }
}
