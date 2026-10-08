class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(char x:s.toCharArray())
        {
            if(x=='(')
            {
                if(count>0)
                {
                    res.append(x);
               }
               count++;
            }
            else
            {
                count--;
                if(count>0)
                {
                    res.append(x);
                }
            }
        }
        return res.toString();
    }
}