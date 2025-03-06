import java.util.Scanner;

public class VowelConsonantIdentifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] classifiedCharacters = classifyCharacters(input);
        displayCharacterTable(classifiedCharacters);

    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase

        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to classify each character in the string and store in a 2D array
    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTable(String[][] table) {
        System.out.println("Character | Type");
        System.out.println("----------------");
        for (String[] row : table) {
            System.out.printf("    %s     | %s%n", row[0], row[1]);
        }
    }

}
