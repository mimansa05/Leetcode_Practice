class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String cur="1";
        for(int i=2;i<=n;i++)
        {
            cur=solve(cur);
        }
        return cur;

    }
    String solve(String s)
    {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            int count=1;
            while(i+1 < s.length() && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}