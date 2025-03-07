import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String text2 = sc.nextLine();

        boolean isAnagram = checkAnagram(text1, text2);

        System.out.println("\nAnagram Check Result:");
        System.out.println("Are the two strings anagrams? " + isAnagram);
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] frequency1 = new int[256]; // ASCII character frequency array
        int[] frequency2 = new int[256];

        // Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }
}

/*
Input;
Enter the first string: abbac
Enter the second string: ababc

Output:
Anagram Check Result:
Are the two strings anagrams? true
*/
