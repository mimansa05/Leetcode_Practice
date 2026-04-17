import java.util.*;

class LC_451_SortCharFreq {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        for(char x:s.toCharArray())
        {
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        List<Character> list=new ArrayList<>(hash.keySet());
        Collections.sort(list,(a,b)-> hash.get(b)-hash.get(a));
        StringBuilder ans=new StringBuilder();
        for(char c:list)
        {
            int freq=hash.get(c);
            for(int i=0;i<freq;i++)
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
