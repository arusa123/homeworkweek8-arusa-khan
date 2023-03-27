import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {
    /*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("enter first number ");
        for (int i = 1; i > 0; i++) {
            while (scanner.hasNextInt()) {
                sum = scanner.nextInt();

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println("The min number is " + min);
            System.out.println("The max number is " + max);
            break;
        }
        scanner.close();
    }
}