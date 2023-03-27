import java.util.Scanner;

public class Programme5_PalindromeNumber {

    /*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
NOTE: The method isPalindrome needs to be defined as public static*/

//    public static void main(String[] args) {
//
//
//    }
//
//    public static int isPalindrome(int number) {
//        boolean isPalindrome;
//   // }
//
//
//
//   // }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scanner.nextInt();
    System.out.println(isPalindrome(n));
    scanner.close();


}
public static boolean isPalindrome(int number){            //boolean method
int reverse = 0;
int a = number;
int sum = 0;
while (number>0|| number <0){
    reverse = number%10;
    sum = sum*10+reverse;
number = number /10;
}
if (a==sum){
    return true;
} else
    return false;

}


}



















