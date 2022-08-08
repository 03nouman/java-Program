import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        // Question 1.Try to declare meaningful variables of each type. Eg - a variable
        // named age should be a numeric type (int or float) not byte.

        // int age = 18;
        // float price = 222.89f;
        // char letter = 'N';

        // Question 2.Make a program that takes the radius of a circle as input,
        // calculates its radius and area and prints it as output to the user.

        // Scanner sc = new Scanner(System.in);
        // double area;

        // int r;
        // System.out.println("Enter Radius of Cirlce");
        // r = sc.nextInt();
        // area = Math.PI * (r * r);
        // System.out.println("Area of Circle is " + area);

        // Question 3.Make a program that prints the table of a number that is input by
        // the user.

        // Calculator Using conditons
        // int A;
        // int B;
        // char operation;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter A value");
        // A = sc.nextInt();

        // System.out.println("Enter B value");
        // B = sc.nextInt();

        // System.out.println("Choose Operation +, - , / , * or % ");
        // operation = sc.next().charAt(0);

        // if (operation == '+') {
        // System.out.println("Addition of two number is" + " " + (A + B));
        // }

        // if (operation == '-') {
        // System.out.println("Substraction of two number is" + " " + (A - B));
        // }

        // if (operation == '*') {
        // System.out.println("Multiplication of two number is" + " " + (A * B));
        // }

        // if (operation == '/') {
        // System.out.println("Division of two number is" + " " + (A / B));
        // }

        // if (operation == '%') {
        // System.out.println("Modulo of two number is" + " " + (A % B));
        // } else {
        // System.out.println("Error");
        // }

        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Month From 1 To 12");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
