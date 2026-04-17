import java.util.HashMap;

class LC_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapT=new HashMap<>();
        for(char x:s.toCharArray())
        {
            mapS.put(x,mapS.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray())
        {
            mapT.put(x,mapT.getOrDefault(x,0)+1);
        }
        return (mapS.equals(mapT));
    }
}
