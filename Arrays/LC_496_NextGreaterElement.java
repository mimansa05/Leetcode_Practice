class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int idx = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == x) {
                    idx = j;
                    break;
                }
            }

            int greater = -1;
            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > x) {
                    greater = nums2[j];
                    break;
                }
            }

            ans[i] = greater;
        }

        return ans;
    }
}