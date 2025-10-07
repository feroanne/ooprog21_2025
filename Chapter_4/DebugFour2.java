// This class uses DebugPen to instantiate two Pen objects
// One with default values and the other with user-supplied values
import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();
        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        // Default constructor
        pen1 = new DebugPen();

        // Corrected: match constructor order (color, point)
        pen2 = new DebugPen(color, point);

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        display(pen2);
    }

    // Fixed: Display method shows both color and point clearly
    public static void display(DebugPen p) {
        System.out.println(" The pen has ink color " + p.getColor() + " and a " + p.getPoint() + " point.");
    }
}

