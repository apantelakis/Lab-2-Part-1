import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double a = 3.14;

        System.out.println("enter integer ");
        int b = read.nextInt();

        double r1 = a + b;
        double r2 = a - b;
        double r3 = a * b;
        double r4 = a / b;
        System.out.println("" + r1 + " " + r2 + " " + r3 + " " + r4);

    }
}
