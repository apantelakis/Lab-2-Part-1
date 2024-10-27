import java.util.Scanner;

public class RandomSquare {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);


        double x = Math.random();
        System.out.println("the random number is " + x);
        double st = Math.sqrt(x);
        System.out.println("square root of the number is: " + st);

    }
}
