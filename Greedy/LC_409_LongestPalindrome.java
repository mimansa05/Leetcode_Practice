import java.util.HashMap;

class LC_409_LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int count=0;
        for(Character c:s.toCharArray())
        {
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        for(Character c:hash.keySet())
        {
            if(hash.get(c)%2==0) count+=hash.get(c);
            else count+=hash.get(c)-1;
        }
        if(count<s.length()) return count+1;
        return count;
    }
}
