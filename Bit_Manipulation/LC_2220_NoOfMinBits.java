class LC_2220_NoOfMinBits {
    public int minBitFlips(int start, int goal) {
        int ans=start ^ goal;
        int count=0;
        while(ans>0)
        {
            count+=ans & 1 ;
            ans=ans>>1;
        }
        return count;
    }
}
