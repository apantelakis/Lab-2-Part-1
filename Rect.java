import java.util.Scanner;

public class Rect {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("enter first side ");
        double a = read.nextDouble();

        System.out.println("enter second side ");
        double b = read.nextDouble();

        double area = a*b;
        double perimeter = (2*a + 2*b);

        System.out.println("area of rectangle: " + area);
        System.out.println("perimeter of rectangle: " + perimeter);
    }
}
