import java.util.Scanner;
import java.util.Arrays;

public class StringWordSplit {
    // Method to find the length of a string without using length()
    public static int findLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitTextWithoutSplitMethod(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extract words based on space indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Splitting text using custom method
        String[] customSplitWords = splitTextWithoutSplitMethod(text);

        // Splitting text using built-in method
        String[] builtInSplitWords = text.split(" ");

        // Comparing the results
        boolean comparisonResult = compareStringArrays(customSplitWords, builtInSplitWords);

        // Displaying results
        System.out.println("Words using custom method: " + Arrays.toString(customSplitWords));
        System.out.println("Words using split(): " + Arrays.toString(builtInSplitWords));
        System.out.println("Comparison result: " + comparisonResult);

    }
}

//Input
//Enter the text: hello world

//Output
//Words using custom method: [hello, world]
//Words using split(): [hello, world]
//Comparison result: true


