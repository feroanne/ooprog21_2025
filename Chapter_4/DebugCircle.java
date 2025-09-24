public class DebugCircle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    // Constructor - initializes radius, diameter, and area
    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    // Original: public int getRadius();
    //    - Error: the semicolon ended the method, making it invalid.
    //    - Also used 'radiuss' instead of 'radius'.
    // Fixed:
    public int getRadius() {
        return radius;
    }

    // Original: public void getDiameter()
    //    - Error: declared as void but had a return statement.
    //    - A method that returns a value must specify the correct type.
    // Fixed:
    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    // Main method to test the class
    public static void main(String[] args) {
        DebugCircle circle = new DebugCircle(10);

        // Print results
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
    }
}

