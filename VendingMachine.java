import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int total = 0;
        int i=0;

        int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
        int money;
        int rem;
        System.out.println("Enter the amt");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        for (i = 0; i <= notes[i]; i++) {
            while (money >= notes[i]) {
                int calNotes = money / notes[i];
                rem = money % notes[i];
                money = rem;
                total = total + calNotes;
                System.out.println(notes[i] + " number of notes " + calNotes);
            }
        }
    }
}
