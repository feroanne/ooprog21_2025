// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4 {
    public static void main(String[] args) {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer >> ");
        one = input.nextInt();

        System.out.print("Enter second integer >> ");
        two = input.nextInt();

        System.out.print("Enter third integer >> ");
        three = input.nextInt();

        System.out.print("Enter fourth integer >> ");
        four = input.nextInt();

        // Corrected logic to find the highest number
        highest = one; // assume first number is highest

        if (two > highest)
            highest = two;
        if (three > highest)
            highest = three;
        if (four > highest)
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}
