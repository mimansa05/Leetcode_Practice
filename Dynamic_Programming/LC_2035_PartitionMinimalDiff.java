import java.util.*;

class LC_2035_PartitionMinimalDiff {
    public int minimumDifference(int[] nums) {
        int n = nums.length;
        int k = n / 2;
        int total = 0;
        for (int x : nums) total += x;

        int[] left = Arrays.copyOfRange(nums, 0, k);
        int[] right = Arrays.copyOfRange(nums, k, n);

        Map<Integer, List<Integer>> leftSums = getSums(left);
        Map<Integer, List<Integer>> rightSums = getSums(right);

        int minDiff = Integer.MAX_VALUE;

        for (int count : leftSums.keySet()) {
            int needed = k - count;
            List<Integer> rList = rightSums.get(needed);
            Collections.sort(rList);

            for (int s1 : leftSums.get(count)) {
                int target = total / 2 - s1;
                int idx = Collections.binarySearch(rList, target);
                if (idx < 0) idx = -idx - 1;

                if (idx < rList.size()) {
                    int s2 = rList.get(idx);
                    minDiff = Math.min(minDiff, Math.abs(total - 2 * (s1 + s2)));
                }
                if (idx > 0) {
                    int s2 = rList.get(idx - 1);
                    minDiff = Math.min(minDiff, Math.abs(total - 2 * (s1 + s2)));
                }
            }
        }
        return minDiff;
    }

    private Map<Integer, List<Integer>> getSums(int[] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <= n; i++) map.put(i, new ArrayList<>());

        for (int i = 0; i < (1 << n); i++) {
            int sum = 0, count = 0;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    sum += arr[j];
                    count++;
                }
            }
            map.get(count).add(sum);
        }
        return map;
    }
}