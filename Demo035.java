import java.util.Scanner;

public class Demo035{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Read the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Determine and print the bigger number
        if (num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The bigger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}