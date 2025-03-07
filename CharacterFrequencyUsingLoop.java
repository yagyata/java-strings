import java.util.Scanner;

public class CharacterFrequencyUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] frequencyArray = findCharacterFrequency(text);
        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencyArray) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];

        // Initialize frequency array and mark duplicates as '0'
        for (int i = 0; i < length; i++) {
            if (characters[i] == '0') continue; // Skip already counted characters
            frequency[i] = 1;

            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Store characters and their frequencies in a 1D array
        String[] result = new String[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + ": " + frequency[i];
            }
        }

        return result;
    }
}

/*
Input
Enter a string: CharacterFrequency

Output
Character Frequencies:
C: 1
h: 1
a: 2
r: 3
c: 2
t: 1
e: 3
F: 1
q: 1
u: 1
n: 1
y: 1
*/
