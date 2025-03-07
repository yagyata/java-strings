import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String modifiedString = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + modifiedString);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // To track already seen characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        return result.toString();
    }

}

/*
Input:
Enter a string: Remove Duplicates

Output:
String after removing duplicates: Remov Duplicats
*/
