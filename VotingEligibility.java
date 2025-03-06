import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; // Fixed number of students

        // Take user input for ages
        int[] ages = inputAges(n);

        // Check eligibility
        String[][] results = checkEligibility(ages);

        // Display results
        displayResults(results);

        sc.close();
    }

    // Method to take user input for student ages
    public static int[] inputAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "True (Can Vote)";
            } else {
                result[i][1] = "False (Cannot Vote)";
            }
        }
        return result;
    }


