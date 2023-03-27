import java.util.Scanner;

public class Programme12_PrimeNumber {
    /* Write a programme to input any number and check if it is prime or not.(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int a = scanner.nextInt();
        isPrime(a);
        scanner.close();

    }


    public static void isPrime(int number) {
        int num = 0;
        if (number <= 1) {
            System.out.println("  it is not a prime number");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + "  is not a prime number");
                    num = 1;
                    break;
                }
            }
            if (num == 0) {
                System.out.println(number + "  is a prime number");
            }

        }
    }
}