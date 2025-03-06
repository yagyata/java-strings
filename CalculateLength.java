import java.util.Scanner;
public class CalculateLength {

	//Method to find length of string without using inbuilt method
	public static int CheckLength(String text) {
		int length = 0;
		try {
			while(true){
				text.charAt(length);
				length++;
			}
		}
		catch(IndexOutOfBoundsException e) {
			return length;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String text = sc.nextLine();

		//Calculating length using custom method
		int stringLength = CheckLength(text);
		System.out.println("Length without using built-in length method: " + stringLength);

		//Calculating length using in-built method
		int buildInLength = text.length();
		System.out.println("Length with using built-in length method: " + buildInLength);
	}
}

//Input
//Enter a String: Good Morning
//Output
//Length without using built-in length method: 12
//Length with using built-in length method: 12

