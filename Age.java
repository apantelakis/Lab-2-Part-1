import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("birth year? ");
        int biryear = read.nextInt();
        System.out.println("name? ");
        String name = read.next();

        int age=2024-biryear;

        System.out.println("Hello, " + name + ". Youre " + age + " 20years old.");



    }
}
