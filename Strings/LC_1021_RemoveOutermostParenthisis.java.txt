class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        String temp="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            temp+=ch;
            if(ch=='(') count++;
            else count--;
            if(count==0)
            {
                res+=temp.substring(1,temp.length()-1);
                temp="";
            }
        }
        return res;
    }
}