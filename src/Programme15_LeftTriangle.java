public class Programme15_LeftTriangle {
   // Display left angle triangle of * using nested for loops

    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
