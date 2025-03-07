import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle case conversion
        String toggledString = toggleCase(input);

        // Displaying the result
        System.out.println("Toggled case string: " + toggledString);

    }

    // Method to toggle case
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
	for(int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (Character.isUpperCase(ch)) {
			result.append(Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch)) {
			result.append(Character.toUpperCase(ch));
		}
		else {
			result.append(ch);
		}
	}
	return result.toString();
    }
}

//Input;
//Enter a string: thIs Is a sTriNg

//Output:
//Toggled case string: THiS iS A StRInG
