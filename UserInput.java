import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value");
        int a = sc.nextInt();
        System.out.println("Enter B value");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Sum of A and B is " + sum);

    }

}
