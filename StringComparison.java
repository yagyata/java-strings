import java.util.Scanner;

public class StringComparison {
    // Method to compare two strings character by character
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparing using custom method
        boolean charAtComparison = compareUsingCharAt(str1, str2);

        // Comparing using built-in equals() method
        boolean equalsMethodComparison = str1.equals(str2);

        // Displaying results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsMethodComparison);

        // Verifying if both methods produce the same result
        if (charAtComparison == equalsMethodComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different!");
        }

    }
}
