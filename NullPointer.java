import java.util.Arrays;

public class NullPointer {
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args) {
        // To generate the exception
        //generateNullPointerException();

        // Call method to handle the exception
        handleNullPointerException();
    }
}
