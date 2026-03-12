class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";
        String s=strs[0];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int flag=1;
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || ch!=strs[j].charAt(i))
                {
                 flag=0;
                 break;

                } 
            }
            if(flag==1)
            {
                res+=ch;
            }
            else break;
        }
        return res;
    }
}