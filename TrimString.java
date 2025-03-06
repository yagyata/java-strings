import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Finding start and end indices for trimming
        int[] indices = findTrimIndices(input);

        // Creating trimmed substring
        String customTrimmed = createSubstring(input, indices[0], indices[1]);

        // Using built-in trim() method
        String builtInTrimmed = input.trim();

        // Comparing both results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Displaying results
        System.out.println("Custom Trimmed String: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed String: '" + builtInTrimmed + "'");
        System.out.println("Both methods produce the same result: " + isSame);

    }

    // Method to find the start and end indices after trimming spaces
    public static int[] findTrimIndices(String text) {
        int start = 0, end = text.length() - 1;

        // Finding the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Finding the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder trimmedString = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmedString.append(text.charAt(i));
        }
        return trimmedString.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
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

}

//Input
//Enter a string with leading and trailing spaces:    good evening

//Output
//Custom Trimmed String: 'good evening'
//Built-in Trimmed String: 'good evening'
//Both methods produce the same result: true
