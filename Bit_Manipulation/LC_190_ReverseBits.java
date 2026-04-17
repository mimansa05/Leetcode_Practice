class LC_190_ReverseBits {
    public int reverseBits(int n) {
        //picking from right and adding to left
        int result=0;
        for(int i=0;i<32;i++)
        {
            result=result<<1;//shifting to left
            result=result | (n & 1);
            n=n>>1;
        }
        return result;
    }
}
