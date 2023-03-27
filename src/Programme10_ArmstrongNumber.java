import java.util.Scanner;

public class Programme10_ArmstrongNumber {
    /*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum = scanner.nextInt();
        armstrongNumber(sum);
        scanner.close();
    }


    public static void armstrongNumber(int number) {
        int digits = 0;                //variables
        int total = 0;
        int a = number;

        while (number != 0) {                          //while loop
            digits = number % 10;
            total = total + digits * digits * digits;
            number = number / 10;
        }
        if (total == a)
            System.out.println(a + " is an Armstrong number");
        else
            System.out.println(a + " is not an Armstrong number");
    }
}
