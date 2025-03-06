import java.util.Scanner;
import java.util.Arrays;

public class CharArray {
    // Method to return all characters in a string as an array without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the string: ");
        String str = sc.next();

        // Getting characters using custom method
        char[] customCharArray = getCharacters(str);

        // Getting characters using built-in method
        char[] builtInCharArray = str.toCharArray();

        // Comparing the character arrays
        boolean comparisonResult = compareCharArrays(customCharArray, builtInCharArray);

        // Displaying results
        System.out.println("Characters using custom method: " + Arrays.toString(customCharArray));
        System.out.println("Characters using toCharArray(): " + Arrays.toString(builtInCharArray));
        System.out.println("Comparison result: " + comparisonResult);

    }
}
