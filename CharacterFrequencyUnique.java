import java.util.Scanner;

public class CharacterFrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        char firstNonRepeatingChar = findFirstNonRepeatingChar(text);
        if (firstNonRepeatingChar != '\0') {
            System.out.println("\nFirst non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }

        String[][] frequencyArray = findCharacterFrequency(text);
        System.out.println("\nCharacter Frequencies:");
        for (String[] entry : frequencyArray) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }

    // Method to find the length of the text without using length()
    public static int findLength(String text) {
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

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with exact size of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array
        int length = findLength(text);

        // Populate frequency array
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no unique character found
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // ASCII character frequency array
        int length = findLength(text);

        // Populate frequency array
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Store unique characters and their frequencies in a 2D array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store frequency
        }

        return result;
    }
}

/*
Input:
Enter a string: This is a String

Output:
Unique characters: T h i s   a S t r n g
First non-repeating character: T

Character Frequencies:
T: 1
h: 1
i: 3
s: 2
 : 3
a: 1
S: 1
t: 1
r: 1
n: 1
g: 1
*/
