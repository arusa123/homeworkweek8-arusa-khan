public class Programme14_DiamondPattern {
    /*Write a program in Java to display the pattern like a diamond.
While loop */

//    public static void main(String[] args) {
//        int n = 4;
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.println(" ");
//            }
//            for (int j = 1; j <= 2*i-1;j++) ;
//            System.out.println("*");
//        }
//        System.out.println();
//        for (int i = n; i >=i; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.println(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) ;
//            System.out.println("*");
//        }
//        System.out.println("*");
public static void main(String[] args) {

    int n = 5;


    //upper part
       for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //lower part
       for(int i=n; i>=1; i--) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    }
