import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Length of Array :");
        int size = scn.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter items: ");

            array[i] = scn.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max value is:" + " " + max);
    }
}
