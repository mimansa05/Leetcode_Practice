class LC_55_JumpGame {
    public boolean canJump(int[] nums) {
        int a = nums.length;
        int max = 0; 

        for (int i = 0; i < a; i++) {
            if (i > max) return false;

            int n = nums[i];
            max = Math.max(max, i + n);

            if (max >= a - 1) return true;
        }
        return true;
    }
}
