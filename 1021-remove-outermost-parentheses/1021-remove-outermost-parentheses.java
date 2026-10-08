class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(char x:s.toCharArray())
        {
            sb.append(x);
            if(x=='(')
            {
                count++;
            }
            else count--;
            if(count==0)
            {
                res.append(sb.substring(1,sb.length()-1));
                sb.setLength(0);
            }
        }
        return res.toString();
    }
}