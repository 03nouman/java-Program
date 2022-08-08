import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        // int counter;

        // for (counter = 0; counter < 11; counter = counter + 1) {
        // System.out.print(counter + " ");
        // }
        // Counter++ = counter + 1
        // for (int i = 0; i < 11; i++) {
        // System.out.println(i);
        // }
        // while Loop
        // int i = 0;

        // while (i < 11) {
        // System.out.print(i + " ");
        // i = i + 1; // i++;
        // }

        // do-while Loop
        // int i = 0;
        // do {
        // System.out.print(i + " ");
        // i = i + 1;
        // } while (i < 11);

        // ***First n natural number ,n=4.*****
        // int n = 4;
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // ***********Print the table of n number,n=2.**************
        // int n = 2;
        // for (int i = 1; i < 11; i++) {
        // System.out.println(n * i);
        // }

        // ***********print n even number***********
        // int even = 2;
        // even += 2;
        // System.out.println(even);
        // int n = 25;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // ************ */ Run****************
        // for (;;) {

        // }
        // ********************* */

        // ****************** */
        // int marks;
        // int input;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Marks");
        // marks = sc.nextInt();
        // do {
        // if (marks >= 90 && marks <= 100) {
        // System.out.println("This is Good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("This is also good");
        // } else if (marks >= 0 && marks <= 59) {
        // System.out.println("This is Good as Well");
        // } else {
        // System.out.println("Invalid");
        // }
        // System.out.println("Enter A input to continue yes(1) ,No(0) ");
        // input = sc.nextInt();
        // } while (input == 1);

        // ****** */ // Qs. Print if a number is prime or not (Input n from the user).
        // [In this problem you will learn how to check if a number is prime or
        // not]//********* */
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is prime or not  ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

            }
        }
        if (count == 2) {
            System.out.println("This is an prime number");

        } else {
            System.out.println("This is not an prime number");
        }
    }

}
