import java.util.Random;

public class StudentGradeCard {

	public static void main(String[] args) {
        	int[][] scores = generateScores();
        	double[][] results = calculatePercentage(scores);
        	char[] grades = determineGrades(results);
        	displayResults(scores, results, grades);
    	}

    static final int NUM_STUDENTS = 10;
    static final int NUM_SUBJECTS = 3;

    // Method to generate random 2-digit scores for PCM subjects
    public static int[][] generateScores() {
        Random rand = new Random();
        int[][] scores = new int[NUM_STUDENTS][NUM_SUBJECTS];
        for (int i = 0; i < NUM_STUDENTS; i++) {
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Generates random marks between 60 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculatePercentage(int[][] scores) {
        double[][] results = new double[NUM_STUDENTS][3]; // Stores total, avg, and percentage
        for (int i = 0; i < NUM_STUDENTS; i++) {
            int total = 0;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                total += scores[i][j];
            }
            double average = total / (double) NUM_SUBJECTS;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to determine the grade based on percentage
    public static char[] determineGrades(double[][] results) {
        char[] grades = new char[NUM_STUDENTS];
        for (int i = 0; i < NUM_STUDENTS; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Method to display student scores in tabular format
    public static void displayResults(int[][] scores, double[][] results, char[] grades) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf(" %6d | %7d | %8d | %4d | %5.0f | %7.2f | %9.2f%% | %5c\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

}
