public class PatternEx {
    public static void main(String[] args) {
        // int n = 4;
        // int number = 1;
        // int m = 5;

        /// *****Qs 1. Print Rectangle ************/
        // Outer loop
        // for (int i = 1; i <= 4; i++) {
        // // Inner loop
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /// *****Qs 2. Print Hollow Rectangle ************/
        // Outer Loop
        // for (int i = 1; i <= n; i++) {
        // // Inner Lopp
        // for (int j = 1; j <= m; j++) {
        // /// Cell -->(i,j)
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // S
        /// *****Qs 3. Print Half pyramid ************/

        // Outer Loop
        // for (int i = 0; i <= n; i++) {
        // // Inner loop
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /// *****Qs 4. Print Invereted Half pyramid ************/
        // Outer Loop
        // for (int i = n; i >= 1; i--) {
        // // Inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /// *****Qs 5. Print Invereted Half pyramid (Roatated by 180 deg)************/
        // Outer Loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop for-->space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /// *****Qs 6. Print Half pyramid (with the numbers)************/
        // Outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        /// *****Qs 7. Print Invereted Half pyramid (with the numbers)************/
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println();
        // }
        /// *****Qs 8. Print patttern for floyd's number************/
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + " ");
        // number++; //number = number +1.
        // }
        // System.out.println();
        // }
        /// *****Qs 9. Print patttern for (0-1 Triangle)************/
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1" + " ");// Even
        // } else {
        // System.out.print("0" + " ");// Odd
        // }
        // }
        // System.out.println();
        // }

        /// *****Qs 10. Print patttern Butter-fly************/
        // // upper half
        // // outer loop(no.of rows)
        // for (int i = 1; i <= n; i++) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");// printing left-side star
        // }
        // // printing spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // right-side star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // // upper half
        // // outer loop(no.of rows)
        // for (int i = n; i >= 1; i--) {
        // // first part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");// printing left-side star
        // }
        // // printing spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }

        // // left-side star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // /// *****Qs 11. Print patttern Solid Rhombus************/
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // int space = n - i;
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // /// *****Qs 12. Print patttern number pyramid************/
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // numbers -->no.of rows = printing the numbers
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        /// *****Qs 13. Print patttern palindrome************/
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= n - i; j++) {/// spaces
        // System.out.print(" ");
        // }
        // // fisrt half number
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // // second half number
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        /// *****Qs 14. Print patttern Diamond************/
        // int n = 4;
        // upper half
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // int star = 2 * i - 1;
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // second half
        // for (int i = n; i >= 1; i--) {
        // // spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // stars
        // int star = 2 * i - 1;
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        int n = 5;
        int m = 5;
        // upper half
        // outer loop
        for (int i = 1; i <= n; i++) {
            // left-side stars
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces
            int spaces = 2 * n - i;
            for (int j = 01; j <= spaces; j++) {
                System.out.print(" ");
            }
            // right-side stars
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            // left-side stars
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces
            int spaces = 2 * n - i;
            for (int j = 01; j <= spaces; j++) {
                System.out.print(" ");
            }
            // right-side stars
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
