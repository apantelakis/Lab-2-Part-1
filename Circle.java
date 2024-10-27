import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("enter radius");
        double rad = read.nextDouble();

       double perimeter = 2*Math.PI*rad;
       double area = rad*rad*Math.PI;

       System.out.println("perimeter of circle is " + perimeter);
       System.out.println("area of circle is " + area);


    }
}
