import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(int[] numbers) {
        // Accessing an index beyond the length of the array
        System.out.println(numbers[numbers.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(int[] numbers) {
        try {
            System.out.println(numbers[numbers.length]); // Trying to access an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index access.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter total numbers: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Uncomment below to generate the exception
        // generateArrayIndexOutOfBoundsException(numbers);

        // Call method to handle the exception
        handleArrayIndexOutOfBoundsException(numbers);

    }
}
