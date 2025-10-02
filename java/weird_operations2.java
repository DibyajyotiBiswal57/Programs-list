import java.util.Scanner;

public class weird_operations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weird operations2");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result;

        if (num1 == num2) {
            result = num1 + num2; // Sum if numbers are equal
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        } else {
            result = num1 * num2; // Product if numbers are not equal
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        }

        scanner.close();
    }
}
