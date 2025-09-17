public class Comments {
    public static void main(String[] args) {
        
        // LINE COMMENT:
        // This is a line comment. It starts with two forward slashes (//)
        // and ends at the end of the line.
        // Line comments are usually used to explain one specific line of code.

        int num1 = 5; // Declare a variable 'num1' and assign it the value 5
        System.out.println("Line Comment Example: num1 = " + num1);

        // BLOCK COMMENT:
        /* 
           This is a block comment.
           It starts with a forward slash and an asterisk and ends with an asterisk and a forward slash.
           Block comments can span multiple lines and are useful
           when explaining a larger section of code or logic.
        */

        int a = 10;
        int b = 20;

        /*
         * Let's add two numbers and print the result.
         * We're using this block comment to describe the logic clearly.
         */
        int sum = a + b;
        System.out.println("Block Comment Example: sum = " + sum);

        // JAVADOC COMMENT:
        /**
         * This is a Javadoc comment.
         * It is used to document classes, methods, or fields.
         * Javadoc comments can be processed by the javadoc tool to generate documentation for developers.
         */

        greetUser(); // Calling a method that has a Javadoc comment
    }

    /**
     * This method prints a greeting to the user.
     * It shows how Javadoc comments can be used to describe what a method does.
     */
    public static void greetUser() {
        System.out.println("Javadoc Comment Example: Yo! What's up? Greeting from a documented method in Java!^-^");
    }
}