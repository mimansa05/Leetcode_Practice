package Counting;
import java.util.HashMap;
class LC_1189_MaxBalloon {
    public int maxNumberOfBalloons(String text) {
        if (text.length()<7) return 0;
        if(text.equals("balloon")) return 1;
        HashMap<Character,Integer> hash=new HashMap<>();
        for(char x:text.toCharArray())
        {
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        int b = hash.getOrDefault('b', 0);
        int a = hash.getOrDefault('a', 0);
        int l = hash.getOrDefault('l', 0) / 2;
        int o = hash.getOrDefault('o', 0) / 2;
        int n = hash.getOrDefault('n', 0);

        return Math.min(Math.min(b, a),
               Math.min(Math.min(l, o), n));
    }
}