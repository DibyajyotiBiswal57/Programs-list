import java.util.Scanner;

public class digits_finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program checks whether a number is a single or double or more than double digits number.");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String digitCount;

        if (Math.abs(number) >= 0 && Math.abs(number) <= 9) {
            digitCount = "single digit";
        } else if (Math.abs(number) >= 10 && Math.abs(number) <= 99) {
            digitCount = "double digit";
        } else {
            digitCount = "more than two digits";
        }

        System.out.println("The number is a " + digitCount + " number.");

        scanner.close();
    }
}