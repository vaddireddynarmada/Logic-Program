import java.util.Scanner;

public class LogicProgram {
    public static void main(String[] args) {
        LogicProgram lp = new LogicProgram();
        lp.stopWatch();
    }

    public void stopWatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to start : ");
        int s = sc.nextInt();
        double start = System.currentTimeMillis();
        System.out.println("Enter number to stop : ");
        int e = sc.nextInt();
        double end = System.currentTimeMillis();
        double elapsedTime = (end - start) / 1000;
        System.out.println("Elapsed time is : " + elapsedTime);
    }
}
