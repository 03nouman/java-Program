import java.util.Scanner;

import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class function {
    // public static void MyName(String name) {// function declared
    // System.out.println(name);// function implemented
    // return;// it means jaha se tum aye waha wapas lot jaw/go out of the block
    // }
    // public static int calculateSum(int a, int b) {
    // int sum = a + b;
    // public static int calculateProduct(int a, int b) {
    // {
    // return a * b;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    /// int sum = calculateSum(a, b);
    // System.out.println("The Sum of the two number is :" + sum);
    // String name = sc.next();
    // MyName(name);// function ko call kiya
    // System.out.println("The Product of two number " + calculateProduct(a, b));
    // public static void printFactorial(int n) {

    // if (n < 0) {
    // System.out.println("Invalid number");
    // return;
    // }
    // // loop
    // int factorial = 1;
    // for (int i = n; i >= 1; i--) {
    // factorial = factorial * i;

    // }
    // System.out.println(factorial);
    // return;

    // }
    // ************* */ Practice Qs.1 Pritn the number is prime or
    // not***************
    // int n;
    // static int count = 0;

    // public static void primeOrNot(int n) {
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // count = count + 1;
    // }
    // }
    // if (count == 2) {
    // System.out.println("Prime Number");

    // } else {
    // System.out.println("It is not Prime");
    // }

    // }
    // ************* */ Practice Qs.2, Pritn the number is Even or
    // not***************
    // public static boolean isEven(int n) {
    // return (n % 2 == 0);

    // }

    // ************* */ Practice Qs.2, Pritn the table for n number************///
    public static void istable(int n) {
        // loop
        System.out.println("The Table of given number is:");
        for (int i = 1; i <= 11; i++) {
            int table = n * i;

            System.out.println(table);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printFactorial(n);
        // primeOrNot(n);
        // if (isEven(n) == true) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        istable(n);

    }
}
