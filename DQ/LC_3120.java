import java.util.*;

class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashMap<Character, Integer> hash = new HashMap<>();

        // frequency store
        for (char x : word.toCharArray()) {
            hash.put(x, hash.getOrDefault(x, 0) + 1);
        }

        int count = 0;

        // check lowercase + uppercase both present
        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (hash.containsKey(ch) &&
                hash.containsKey(Character.toUpperCase(ch))) {
                
                count++;
            }
        }

        return count;
    }
}