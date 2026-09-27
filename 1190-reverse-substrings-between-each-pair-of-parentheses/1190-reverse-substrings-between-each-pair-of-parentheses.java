class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<StringBuilder> st=new Stack<>();
        for(char x:s.toCharArray())
        {
            if(x=='(')
            {
                st.push(sb);
                sb=new StringBuilder();
            }
            else if(x==')')
            {
                sb.reverse();
                StringBuilder temp=st.pop();
                temp.append(sb);
                sb=temp;

            }
            else
            {
                sb.append(x);
            }
        }
        return sb.toString();
    }
}