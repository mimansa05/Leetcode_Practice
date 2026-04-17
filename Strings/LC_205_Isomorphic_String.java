import java.util.HashMap;

class LC_205_Isomorphic_String {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hash=new HashMap<>();
        if(s.length()==t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                char c=t.charAt(i);
                if(!hash.containsKey(ch))
                {
                    if(!hash.containsValue(c))
                    {
                        hash.put(ch,c);
                    }
                    else return false;
                }
                else
                {
                    char map=hash.get(ch);
                    if(map!=c) return false;
                }
            }
            return true;
        }
        return false;
    }
}
