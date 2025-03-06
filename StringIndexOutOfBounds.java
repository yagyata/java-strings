import java.util.Scanner;

public class StringIndexOutOfBounds {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Accessing an index beyond the length of the string
        System.out.println(text.charAt(text.length())); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println(text.charAt(text.length())); // Trying to access an invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index access.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the string: ");
        String text = sc.next();

        //To generate the exception:
        //generateStringIndexOutOfBoundsException(text);

        // Call method to handle the exception
        handleStringIndexOutOfBoundsException(text);

    }
}
