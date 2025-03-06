import java.util.Scanner;

public class NumberFormatExceptionn {

    // Method that generates NumberFormatException
    public static void generateException(String text) {
        // This line will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    // Method to handle NumberFormatException using try-catch block
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String inputText = sc.next();

        // Calling the method that generates the exception
        // generateException(inputText);

        // Calling the method that handles the exception
        handleException(inputText);

    }
}
