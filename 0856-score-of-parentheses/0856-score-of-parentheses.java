class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(0);
            }

            else {
                int inner = st.pop();

                if (inner == 0) {
                    inner = 1;
                } 
                else {
                    inner = 2 * inner;
                }

                st.push(st.pop() + inner);
            }
        }

        return st.pop();
    }
}