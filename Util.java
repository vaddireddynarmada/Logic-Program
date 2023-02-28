import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        sqrt();
    }

    public static void sqrt(){
        System.out.println("Enter the number to find Square root");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        if(c<0) {
            double epsilon = 1e-15;
            double t = c;
            while (Math.abs(t - c / t) > epsilon * t) {
                t = (c / t + t) / 2.0;
            }
            System.out.println("square root is " + t);
        }
        else {
            System.out.println("negative");
        }
    }
}
