import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking number
        if (number > 0) {
            System.out.println("Positive number");
        } 
        else if (number < 0) {
            System.out.println("Negative number");
        } 
        else {
            System.out.println("Zero");
        }
    }
}