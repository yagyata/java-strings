import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Convert to lowercase for easier comparison
        input = input.toLowerCase();

        // Compute vowel and consonant count
        int[] counts = countVowelsAndConsonants(input);

        // Display results
        displayCounts(counts[0], counts[1]);
    }

    public static int[] countVowelsAndConsonants(String input) {
        int vowelCount = 0, consonantCount = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".contains(String.valueOf(ch))) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void displayCounts(int vowels, int consonants) {
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}


//Input
//Enter a string: Hello Java

//Output
//Number of vowels: 4
//Number of consonants: 5
