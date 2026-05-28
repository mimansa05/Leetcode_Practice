class LC_1863_SumofSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        int res = 0;

        for(int curr: nums)
        {
            res |= curr;
        }

        return res * (1<<nums.length-1);

    }
}