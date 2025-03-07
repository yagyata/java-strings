import java.util.Scanner;

public class UniqueCharacters {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
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
}

//Input
//Enter a string: Good Morning

//Output
//Unique characters: G o d   M r n i g
