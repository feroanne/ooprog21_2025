// This application displays some math facts
import java.util.Scanner;

public class DebugThree2 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        a = input.nextInt();

        System.out.print("Enter a second integer >> ");
        b = input.nextInt();  // Changed from a to b

        System.out.print("Enter a third integer >> ");
        c = input.nextInt();  // Changed from a to c

        add(a, b);
        add(b, c);
        add(a, c);

        subtract(a, b);  // Fixed method name spelling
        subtract(b, c);
        subtract(a, c);
    }

    public static void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));  // Fixed sum calculation and return type
    }

    public static void subtract(int a, int b) {
        System.out.println("The difference between " + a + " and " + b + " is " + (a - b));  // Fixed string concatenation and method name spelling
    }
}

