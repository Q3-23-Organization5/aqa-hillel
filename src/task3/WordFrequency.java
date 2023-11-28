package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("rock");
        words.add("Sun");
        words.add("rock");
        words.add("wind");
        words.add("sun");
        words.add("Wind");
        words.add("rock");

        HashMap<String, Integer> wordFrequency = new HashMap<>();

         for (String word : words) {
         String lowercaseWord = word.toLowerCase();

          wordFrequency.put(lowercaseWord, wordFrequency.getOrDefault(lowercaseWord, 0) + 1);
        }

        System.out.println("Unique Words and Their Frequencies:");
        for (String uniqueWord : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(uniqueWord);
            System.out.println(uniqueWord + " - " + frequency);
        }
    }
}
