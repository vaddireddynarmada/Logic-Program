import java.util.Scanner;

public class LogicProgram {
    public static void main(String[] args) {
        LogicProgram lp = new LogicProgram();
        lp.reverseNumber();
    }

    public void reverseNumber() {
        System.out.println("Reverse Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int reminder;
        int reverse = 0;
        for (int i = 0; i <= num; i++) {
            if (num != 0) {
                reminder = num % 10;
                reverse = reverse * 10 + reminder;
                num = num / 10;
            }
        }
        System.out.println("reverse number : " + reverse);
    }
}
