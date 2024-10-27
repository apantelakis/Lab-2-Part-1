import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        System.out.println("enter first number");
        double a = read.nextDouble();

        System.out.println("enter second number");
        double b = read.nextDouble();

        double sol = (b/a)*100;
        System.out.println("percentage of second to first number is " + sol + " %.");


    }
}
