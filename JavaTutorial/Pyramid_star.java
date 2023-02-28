
public class Pyramid_star {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = (n - 1); j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
