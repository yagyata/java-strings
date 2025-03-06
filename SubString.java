import java.util.Scanner;

public class StringComparison {
    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }
        return subStr.toString();
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
        System.out.print("Enter the string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Creating substring using custom method
        String customSubstring = substringUsingCharAt(str, start, end);

        // Creating substring using built-in method
        String builtInSubstring = str.substring(start, end);

        // Comparing the substrings
        boolean comparisonResult = compareUsingCharAt(customSubstring, builtInSubstring);

        // Displaying results
        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Comparison result: " + comparisonResult);

    }
}
