import java.util.Scanner;

public class Problem2WordReversalEncoder {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ", -1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord.append(words[i].charAt(j));
            }
            if (i > 0) result.append(" ");
            result.append(reversedWord);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        System.out.println(reverseEachWord(sc.nextLine()));
        sc.close();
    }
}
