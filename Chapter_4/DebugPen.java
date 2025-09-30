public class DebugPen {
    private String color;
    private String point;

    // Default constructor
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    // Parameterized constructor
    public DebugPen(String color, String point) {
        // Wrong before: color = color; point = point;
        // Fixed using 'this' to avoid shadowing
        this.color = color;
        this.point = point;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for point
    public String getPoint() {
        return point;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        DebugPen pen1 = new DebugPen();
        System.out.println("Pen1 Color: " + pen1.getColor());
        System.out.println("Pen1 Point: " + pen1.getPoint());

        // Using parameterized constructor
        DebugPen pen2 = new DebugPen("blue", "medium");
        System.out.println("Pen2 Color: " + pen2.getColor());
        System.out.println("Pen2 Point: " + pen2.getPoint());
    }
}
