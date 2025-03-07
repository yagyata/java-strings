import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Replacing the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Displaying the result
        System.out.println("Modified Sentence: " + modifiedSentence);

    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}

//Input:
//Enter a sentence: Replace this word
//Enter the word to replace: this
//Enter the new word: that

//Output
//Modified Sentence: Replace that word
