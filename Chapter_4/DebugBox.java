import java.util.Scanner;

public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + "\nLength: " + length + "\nHeight: " + height);
    }

    public int getVolume() {
        double vol = length * width * height;
        return (int) vol;
    }

    // Main method to test DebugBox class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for box dimensions
        System.out.print("Enter the width of the box: ");
        int widthInput = scanner.nextInt();
        System.out.print("Enter the length of the box: ");
        int lengthInput = scanner.nextInt();
        System.out.print("Enter the height of the box: ");
        int heightInput = scanner.nextInt();

        // Create DebugBox object
        DebugBox box = new DebugBox(widthInput, lengthInput, heightInput);

        // Display results
        box.showData();
        System.out.println("Volume: " + box.getVolume());
    }
}

