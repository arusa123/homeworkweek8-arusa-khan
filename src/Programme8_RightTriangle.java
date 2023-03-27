public class Programme8_RightTriangle {
  /*  Display right angle triangle of @ using nested for loops */

    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();

        }
    }
}