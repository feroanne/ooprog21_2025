import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
       
        // Create a Scanner object to read user input from the keyboard
        Scanner scan = new Scanner(System.in);

        // Predefined string that the program will compare against
        String target = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = scan.nextLine();

        // Compare the predefined string and user input using a strict (case-sensitive) comparison
        if (target.equals(userInput)) {
            System.out.println(target + " equals " + userInput);
        } else {
            System.out.println(target + " does not equal " + userInput);
        }

        scan.close();
    }
}

