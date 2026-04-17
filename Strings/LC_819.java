import java.util.*;

class LC_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = paragraph.split("\\s+");

        String ans = "";
        int max = 0;

        for (String word : words) {
            if (!ban.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);

                if (map.get(word) > max) {
                    max = map.get(word);
                    ans = word;
                }
            }
        }
        return ans;
    }
}
