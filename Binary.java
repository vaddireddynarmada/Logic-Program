import java.util.Scanner;

public class Binary {
    public static void toBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number");
        int decimalNum = sc.nextInt();
        System.out.println("Binary Representation of " + decimalNum + " is :");
        int[] binaryArray = new int[1000];
        int index = 0;
        while (decimalNum > 0) {
            binaryArray[index] = decimalNum % 2;
            decimalNum = decimalNum / 2;
            index++;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
    }

    public static void main(String[] args) {

        int decimalNumber = 34;
        toBinary();
    }
}
