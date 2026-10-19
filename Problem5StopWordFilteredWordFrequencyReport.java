import java.util.*;

public class Problem5StopWordFilteredWordFrequencyReport {
    static void printFilteredWordFrequency(String feedback) {
        Set<String> stopWords = new HashSet<>(Arrays.asList(
            "the", "was", "and", "a", "is", "of", "in"
        ));

        String cleaned = feedback.toLowerCase()
                                 .replace(".", "")
                                 .replace(",", "")
                                 .replace("!", "")
                                 .replace("?", "")
                                 .replace(";", "")
                                 .replace(":", "")
                                 .replace("\"", "")
                                 .replace("'", "");
        String trimmed = cleaned.trim();
        if (trimmed.isEmpty()) {
            System.out.println("No words to report.");
            return;
        }

        String[] words = trimmed.split("\\s+");
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty() || stopWords.contains(word)) continue;
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback paragraph: ");
        printFilteredWordFrequency(sc.nextLine());
        sc.close();
    }
}
