import java.util.Scanner;

public class Conditions {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Your Age is below 18");
        // }
        System.out.println("Enter A Value");
        int A = sc.nextInt();
        System.out.println("Enter A Value");
        int B = sc.nextInt();
        if (A == B) {
            System.out.println("Equal");
        } else if (A > B) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }
    }
}
