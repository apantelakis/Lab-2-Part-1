import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("enter base ");
        double base = read.nextDouble();

        System.out.println("enter height ");
        double h = read.nextDouble();

        System.out.println("enter first side ");
        double a = read.nextDouble();

        System.out.println("enter second side");
        double b = read.nextDouble();


        double area = (base*h)/2;
        double perimeter = base + a + b;

        System.out.println("area of triangle: " + area);
        System.out.println("perimeter of perimeter: " + perimeter);
    }
}
