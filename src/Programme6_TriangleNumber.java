public class Programme6_TriangleNumber {
    /*Write a program in Java to display the pattern like a triangle with a number.*/

    public static void main(String args[]) {
        int n = 10;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }




}



