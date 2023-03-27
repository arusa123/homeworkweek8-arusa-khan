import java.util.Scanner;

public class Programme13_SharedDigit {
    /*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int number = scanner.nextInt();
        System.out.println("Enter second value: ");
        int value = scanner.nextInt();
        System.out.println(hasSharedDigit(number,value));
        scanner.close();
    }
    public static boolean hasSharedDigit(int a , int b){            //boolean
        if (a<10 || a>99 || b<10 | b>99) {
            return false;
        }
       int digit = a;
        while (digit!=0){
            int num = b;
            while (num!=0){
                if ((digit % 10) == (num%10)){
    return true;
                }
                num = num/10;
            }
            digit = digit/10;
        }
        return false;
    }




}
