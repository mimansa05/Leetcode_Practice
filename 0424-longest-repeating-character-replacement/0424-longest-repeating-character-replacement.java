class Solution {
    public int characterReplacement(String s, int k) {
        //sliding window max length k include krke lenge
        int[] freq=new int[26];
        int l=0;
        int maxc=0;
        int maxl=0;
        for(int r=0;r<s.length();r++)
        {
            freq[s.charAt(r)-'A']++;
            maxc=Math.max(maxc,freq[s.charAt(r)-'A']);
            while((r-l+1)-maxc>k)
            {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}