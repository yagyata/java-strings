import java.util.Scanner;

public class LowerCaseComparison {
    // Method to convert text to lowercase using charAt()
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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

        // Converting text to lowercase using custom method
        String customLowerCase = toLowerCaseCustom(text);

        // Converting text to lowercase using built-in method
        String builtInLowerCase = text.toLowerCase();

        // Comparing the results
        boolean comparisonResult = compareUsingCharAt(customLowerCase, builtInLowerCase);

        // Displaying results
        System.out.println("Lowercase using custom method: " + customLowerCase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowerCase);
        System.out.println("Comparison result: " + comparisonResult);

    }
}

//Output:
//Enter the text: HeLLo
//Lowercase using custom method: hello
//Lowercase using toLowerCase(): hello
//Comparison result: true

