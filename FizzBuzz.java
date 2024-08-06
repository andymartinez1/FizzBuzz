import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User inputted number for FizzBuzz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println(number + " Fizz");
        } else if (number % 5 == 0) {
            System.out.println(number + " Buzz");
        } else {
            System.out.println(number + " Neither Fizz nor Buzz");
        }

        // Iterate with a for loop

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i + " Neither Fizz nor Buzz");
            }
        }
    }
}
