public class DebugBox {
    private int width;
    private int length;
    private int height;

    // Default constructor
    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    // Constructor with parameters
    public DebugBox(int width, int length, int height) {
        this.width = width;
        // Wrong: this.length = width; this.height = width;
        // Fixed: assign properly
        this.length = length;
        this.height = height;
    }

    // Method to show box dimensions
    public void showData() {
        System.out.println("Width: " + width + "  Length: " + length + "  Height: " + height);
    }

    // Wrong: public getVolume() { ... }
    //    - No return type declared
    // Fixed:
    public double getVolume() {
        double vol = length * width * height;
        return vol;
    }

     // Main method to test
    public static void main(String[] args) {
        DebugBox box1 = new DebugBox();        // uses default constructor
        DebugBox box2 = new DebugBox(2, 4, 6); // uses parameterized constructor
        
        System.out.println("Box 1:");
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        System.out.println("\nBox 2:");
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
}


