import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = scn.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter items: ");
            array[i] = scn.nextInt();
        }
        System.out.print("Duplicate values are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                }
            }
        }

    }
}
