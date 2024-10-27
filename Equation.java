import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("enter first number");
        double a = read.nextDouble();

        System.out.println("enter second number");
        double b = read.nextDouble();

        double x = (-b/a);
        System.out.println("x equals "); System.out.println(x);

    }
}
