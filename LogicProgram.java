import java.util.Scanner;

public class LogicProgram {
    public static void main(String[] args) {
    LogicProgram lp=new LogicProgram();
    lp.fibonacciSeries();
    }
    public void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1);
        for (int i = 1; i <= num; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}