import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String target = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        if (target.equals(userInput)) {
            System.out.println(target + " equals " + userInput);
        } else {
            System.out.println(target + " does not equal " + userInput);
        }

        input.close();
    }
}
