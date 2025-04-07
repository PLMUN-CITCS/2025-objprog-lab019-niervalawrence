import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get a valid non-negative integer input from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompt the user for input
        System.out.print("Enter a non-negative integer: ");

        // Validate input to ensure it is a non-negative integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid non-negative integer.");
            scanner.next(); // Consume the invalid input
            System.out.print("Enter a non-negative integer: ");
        }

        number = scanner.nextInt();

        // Ensure the number is non-negative
        while (number < 0) {
            System.out.println("Input cannot be negative. Please enter a non-negative integer.");
            number = scanner.nextInt();
        }

        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        // Handle the base case for factorial of 0
        if (n == 0) {
            return 1;
        }

        // Calculate factorial for n > 0 using a loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
