class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        HashMap<String,String> hash=new HashMap<>();
        for(List<String> x:knowledge)
        {
            hash.put(x.get(0),x.get(1));
        }
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                int j=i+1;
                while(s.charAt(j)!=')') j++;
                String m=s.substring(i+1,j);
                if(hash.containsKey(m))
                {
                    sb.append(hash.get(m));
                }
                else
                {
                    sb.append("?");
                }
                i=j;
            }
            else
            {
                sb.append(ch);
            }
        }
    return sb.toString();
    }
}