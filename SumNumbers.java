import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter numbers (0 to stop):");

        number = input.nextInt();

        while (number != 0) {
            sum = sum + number;
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
    }
}