import java.util.Scanner;

public class Excercise {
    // * */ Question 1
    // public static void avg(int num1, int num2, int num3) {
    // int avg = (num1 + num2 + num3) / 3;
    // System.out.println("The Average of three number is " + avg);
    // }
    // * */ Question 2...
    // public static void sumOfOdd(int n) {
    // // loop
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // System.out.println(sum);
    // System.out.println("The sum of odd number:" + sum);
    // }
    // }
    // }

    // * */ Question 3...
    // public static void getGreater(int a, int b) {
    // // conditions
    // if (a > b) {
    // System.out.println("A is greater than b");
    // } else {
    // System.out.println("B is greater than a");
    // }
    // }

    // * */ Question 4...
    // public static Double getCircumferance(Double radius) {
    // return 2 * 3.14 * radius;
    // }
    // * */ Question 5...
    // public static void isEligible(int age) {
    // if (age >= 18) {
    // System.out.println("Eligible for Voting ");
    // } else {
    // System.out.println("Not Eligible for Voting");
    // }
    // }

    // * */ Question 6...

    // * */ Question 7...

    // * */ Question 8...
    // public static void raisedToPower(int x, int n) {
    // int result = 1;
    // // loop
    // for (int i = 1; i <= n; i++) {
    // result = result * x;
    // }
    // System.out.println("x to the power of n is " + result);
    // }

    // Question n0.9
    // public static void getCommonDivisior(int a, int b) {

    // while (a != b) {
    // if (a > b) {
    // a = a - b;
    // System.out.println("The GCD is " + a);
    // } else {
    // b = b - a;
    // System.out.println("The GCD is " + b);
    // }
    // }

    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // * */ Question 1...Enter 3 numbers from the user & make a function to print
        // their
        // average.**
        // System.out.println("Enter a First Number");
        // int num1 = sc.nextInt();
        // System.out.println("Enter a Second Number");
        // int num2 = sc.nextInt();
        // System.out.println("Enter a Third Number");
        // int num3 = sc.nextInt();
        // avg(num1, num2, num3);

        // * */ Question 2...Write a function to print the sum of all odd numbers from 1
        // to n.
        // int n = sc.nextInt();
        // sumOfOdd(n);

        // * */ Question 3...Write a function which takes in 2 numbers and returns the
        // greater of those two.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // getGreater(a, b);

        // * */ Question 4... Write a function that takes in the radius as input and
        // returns the circumference of a circle.
        // Double radius = sc.nextDouble();
        // System.out.println("The circumference of a circle is:" +
        // getCircumferance((double) radius));

        // * */ Question 5...Write a function that takes in age as input and returns if
        // that person is eligible to vote or not. A person of age > 18 is eligible to
        // vote.

        // int age = sc.nextInt();
        // isEligible(age);

        // * */ Question 6...Write an infinite loop using do while condition.
        // do {

        // } while (true);

        // * */ Question 7...Write a program to enter the numbers till the user wants
        // and at the end it should display the count of positive, negative and zeros
        // enterd.
        // int positive = 0, negative = 0, zeros = 0;
        // System.out.println("Press a number 1 to continue or 0 to stop");
        // int input = sc.nextInt();
        // while (input == 1) {
        // System.out.println("Enter Your Number");
        // int number = sc.nextInt();
        // if (number > 0) {
        // positive++;
        // } else if (number < 0) {
        // negative++;
        // } else {
        // zeros++;
        // }
        // System.out.println("Press a number 1 to continue or 0 to stop");
        // input = sc.nextInt();

        // }
        // System.out.println("The count of Positives : " + positive);
        // System.out.println("The count of negatives : " + negative);
        // System.out.println("The count of Zeros : " + zeros);

        //// * */ Question 8...Two numbers are entered by the user, x and n. Write a
        //// function to find the value of one number raised to the power of another
        //// i.e. xn.
        // System.out.println("Enter The x value");
        // int x = sc.nextInt();

        // System.out.println("Enter The n value");
        // int n = sc.nextInt();

        // raisedToPower(x, n);
        // Question 9...Write a function that calculates the Greatest Common Divisor of
        // 2 numbers. (BONUS)

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first value");
        // int a = sc.nextInt();
        // System.out.println("Enter second value");
        // int b = sc.nextInt();
        // getCommonDivisior(a, b);

        // Question 10...Write a program to print Fibonacci series of n terms where n is
        // input by user
        // 0 1 1 2 3 5 8 13 21 ..... ,In the Fibonacci series, a number is the sum of
        // the previous 2 numbers that came before it.
        int a = 0;
        int b = 1;
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" " + a);
        // find nth term
        for (int i = 2; i <= n; i++) {

            System.out.print(" " + b);

            // below concept is swapping
            temp = b;
            b = a + b;
            a = temp;
        }

    }
}