import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            num = scn.nextInt();
        } while (num != 0);

    }
}
