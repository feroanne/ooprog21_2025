import java.util.Scanner;

public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    // Main method to test DebugCircle class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        int radiusInput = scanner.nextInt();

        // Create DebugCircle object
        DebugCircle circle = new DebugCircle(radiusInput);

        // Display results
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}
