import java.util.Scanner;

public class IllegalArgument {

    // Method that generates IllegalArgumentException
    public static void generateException(String text) {
        // Setting start index greater than end index
        int startIndex = 5;
        int endIndex = 2;

        // This line will throw IllegalArgumentException
        String sub = text.substring(startIndex, endIndex);
        System.out.println("Substring: " + sub);
    }

    // Method to handle the exception using try-catch block
    public static void handleException(String text) {
        try {
            int startIndex = 5;
            int endIndex = 2;
            String sub = text.substring(startIndex, endIndex);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = sc.next();

        // Calling the method that generates the exception
        // generateException(inputText);

        // Calling the method that handles the exception
        handleException(inputText);

    }
}
