class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++)
        {
            int bit=n & 1;//Remove rightmost bit
            result=result << 1;//make space
            result=result | bit;//add bit
            n=n >>> 1;//move to next bit
        }
        return result;
    }
}