import java.util.Scanner;

public class UpperCaseComparison {
    // Method to convert text to uppercase using charAt()
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

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
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Converting text to uppercase using custom method
        String customUpperCase = toUpperCaseCustom(text);

        // Converting text to uppercase using built-in method
        String builtInUpperCase = text.toUpperCase();

        // Comparing the results
        boolean comparisonResult = compareUsingCharAt(customUpperCase, builtInUpperCase);

        // Displaying results
        System.out.println("Uppercase using custom method: " + customUpperCase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpperCase);
        System.out.println("Comparison result: " + comparisonResult);

    }
}
