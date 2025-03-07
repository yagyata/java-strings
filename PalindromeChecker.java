import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean isPalindrome1 = isPalindromeIterative(text);
        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = isPalindromeUsingCharArray(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iteration: " + isPalindrome1);
        System.out.println("Using Recursion: " + isPalindrome2);
        System.out.println("Using Character Array: " + isPalindrome3);
    }

    // Logic 1: Check palindrome using iteration
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}

/*
Input:
Enter a string: abcba

Output:
Palindrome Check Results:
Using Iteration: true
Using Recursion: true
Using Character Array: true


Input:
Enter a string: car

Output:
Palindrome Check Results:
Using Iteration: false
Using Recursion: false
Using Character Array: false
*/
