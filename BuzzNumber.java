import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz Number!");
        } else {
            System.out.println(number + " is not a Buzz Number.");
        }

        scanner.close();
    }

    public static boolean isBuzzNumber(int number) {
        // Check if the number is divisible by 7 or has the last digit as 7
        return number % 7 == 0 || number % 10 == 7;
    }
}