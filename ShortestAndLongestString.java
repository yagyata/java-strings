import java.util.Scanner;
import java.util.Arrays;

public class ShortestAndLongestString {
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

    // Method to generate 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i]));
        }
        return wordsWithLengths;
    }

    // Method to find shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = shortestLength;

        for (String[] entry : wordsWithLengths) {
            int length = Integer.parseInt(entry[1]);
            if (length < shortestLength) {
                shortest = entry[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = entry[0];
                longestLength = length;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Splitting text using custom method
        String[] customSplitWords = splitTextWithoutSplitMethod(text);

        // Generating 2D array with words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(customSplitWords);

        // Finding shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Displaying results
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

    }
}

//Input
//Enter the text: Hey it's nice to meet you

//Output
//Shortest word: to
//Longest word: it's

