import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Sum elements that appear exactly once
        int sum = 0;
        for (int num : nums) {
            if (freq.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}