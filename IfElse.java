import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Are you want to get bike license?");
        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        if (age < 18) {
            System.out.println("You are too short to get license");
        } else if (age > 18 && age < 50) {
            System.out.println("You are able to get license");
        } else {
            System.out.println("You are too old to get license");
        }
    }
}
