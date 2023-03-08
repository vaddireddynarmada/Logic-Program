import java.util.Scanner;

public class Binary {
    public static void toBinary() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int binary[] = new int[40];
        int index = 0;
        int res = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        System.out.println("Binary is");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i] + "\t");
        }
        power(res);
    }

    public static void power(int res) {
        while (res != 1) {
            if (res % 2 != 0)
                System.out.println("not power of 2");
            res = res / 2;
        }
        System.out.println("power of 2");
    }

    public static int[] swapNibbles(int[] arr) {
        int temp, j = arr.length - 4;
        for (int i = 0; i < 4; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        toBinary();
    }
}
