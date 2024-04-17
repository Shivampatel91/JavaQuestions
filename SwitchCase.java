import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Select option between 1-5: ");
        int age = scn.nextInt();
        switch (age) {
            case 1:
                System.out.println("Option 1 is selected");
                break;

            case 2:
                System.out.println("Option 1 is selected");
                break;

            case 3:
                System.out.println("Option 1 is selected");
                break;

            case 4:
                System.out.println("Option 1 is selected");
                break;

            case 5:
                System.out.println("Option 1 is selected");
                break;

            default:
                System.out.println("please seclect option between 1-5");
                break;
        }

    }
}
