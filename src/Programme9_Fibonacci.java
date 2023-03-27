import java.util.Scanner;

public class Programme9_Fibonacci {
///*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the number: ");
//    int fib = scanner.nextInt();
//    scanner.close();
////int a = 1;
////int b = 0;
////
//////while (count>0 && count<=99){
////    for (int i = 1; i<fib; i++){
////            System.out.println(a );
////            int sum = a+b;
////            a=b;
////            b=sum;
////        }
////    }
////}
//
//    public static void fibonacciNumber(){
//        int num1 = 1;
//        int num2 = 1;
//        int num3 = 0;
//
//        while (count > 0 && count <= 99) {
//            for (int i = 1; i < count; i++) {
//                if (num3 <= 144) {
//                    System.out.print(num1 + " ");
//                    num3 = num1 + num2;
//                    num1 = num2;
//                    num2 = num3;
//
//                } else if (num3 >= 144) {
//                    System.exit(1);
//                } else
//                    System.out.println(" Value is out of bound");


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fib = scanner.nextInt();
        fibonacciNumber(fib);
        scanner.close();

    }

    public static void fibonacciNumber(int count) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        while (count > 0 && count <= 99) {
            for (int i = 1; i < count; i++) {
                if (num3 <= 144) {
                    System.out.print(num1 + " ");
                    num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;

                } else if (num3 >= 144) {
                    System.exit(1);
                } else
                    System.out.println(" Value is out of bound");
            }
        }

    }}
