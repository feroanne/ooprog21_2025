// This class uses DebugCircle to instantiate a Circle object
import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        // Create a DebugCircle object using radius
        DebugCircle c = new DebugCircle(radius);

        // Use correct getter method names
        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diameter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());
    }
}
