import java.util.Scanner;

public class LogicProgram {
    public static void main(String[] args) {
        LogicProgram lp = new LogicProgram();
        lp.primeNumber();
    }

    public void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter prime number");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }
}
