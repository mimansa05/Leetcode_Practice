class Solution {
    public boolean checkValidString(String s) {
        int open=0;
        int maxopen=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open++;
                maxopen++;
            }
            else if(ch==')')
            {
                open--;
                maxopen--;
            }
            else if(ch=='*')
            {
                open--;
                maxopen++;
            }
            if(maxopen<0) return false;
            if(open<0) open=0;

        }
        return open==0;
    }
}