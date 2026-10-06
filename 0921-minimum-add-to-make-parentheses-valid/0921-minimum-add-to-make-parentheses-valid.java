class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='(')
            {
                st.push(x);
            }
            else if(!st.isEmpty())
            {
                if(st.peek()=='(')
                {
                    st.pop();
                }
            }
            else
            {
                count++;
            }
        }
        return count+st.size();
    }
}