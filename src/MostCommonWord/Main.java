package MostCommonWord;

import java.util.*;

public class Main {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String , Integer> wordCounts = new HashMap<>();
        int maxFrequency = 0;
        String mostCommon = "";
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]+");

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            if (!bannedSet.contains(word) && frequency > maxFrequency) {
                maxFrequency = frequency; // Update maxFrequency
                mostCommon = word; // Update mostCommon
            }
            // Break the loop if the most common word is found
            if (frequency == maxFrequency && !bannedSet.contains(word)) {
                break;
            }
        }
        return mostCommon;
    }
}



