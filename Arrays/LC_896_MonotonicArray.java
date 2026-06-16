class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[j - 1]) {
                if (flag == -1) return false;
                flag = 1;
            } 
            else if (nums[j] < nums[j - 1]) {
                if (flag == 1) return false;
                flag = -1;
            }
        }

        return true;
    }
}