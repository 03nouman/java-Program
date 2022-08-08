import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Printing fibonacci series for n value.

        // int x = 0, y = 1, z = 0;
        // System.out.println("Enter The n value");
        // int n = sc.nextInt();
        // while (z <= n) {
        // System.out.println(z);
        // // swapping
        // x = y;
        // y = z;
        // z = x + y;
        // }

        // priting n term fibonacci series.
        int x = 0, y = 1, z = 0, term = 1;
        System.out.println("Enter The n value");
        int n = sc.nextInt();
        while (term <= n) {
            System.out.println(z);
            // swapping
            x = y;
            y = z;
            z = x + y;
            term++;
        }
    }
}
