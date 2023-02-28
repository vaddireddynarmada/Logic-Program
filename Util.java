import java.util.Scanner;

public class Util {
    public static void main(String[] args) {

        temperatureConversion();
    }

    public static void temperatureConversion() {
        System.out.println("temperature Conversion");
        float celsius, fahrenheit, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter celsius");
                celsius = sc.nextFloat();
                result = (celsius * 9 / 5) + 32;
                System.out.println("Fahrenheit value " + result);
                break;
            case 2:
                System.out.println("Enter Fahrenheit");
                fahrenheit = sc.nextFloat();
                result = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius value " + result);
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
