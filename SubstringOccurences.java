import java.util.Scanner;

public class SubstringOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = sc.nextLine();

        int count = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + count + " times in the main string.");
    }

    public static int countOccurrences(String mainString, String subString) {
        if (subString.isEmpty()) return 0; // Prevent infinite loop for empty substring

        int count = 0, index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move index ahead
        }

        return count;
    }
}

//Input
//Enter the main string: This is the string
//Enter the substring to count: is

//Output
//The substring "is" appears 2 times in the main string.
