class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        //1. All XOR
        for(int x:nums)
        {
            xor=xor^x;
        }
        //2. Check which bit differs
        int bit= xor & -xor;
        int a=0;
        int b=0;
        //3. Split and find two numbers 
        for(int x:nums)
        {
            if((x & bit) !=0)
            {
                a ^= x;
            }
            else
            {
                b ^= x;
            }
        }
        return new int[]{a,b};
    }
}