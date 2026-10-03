class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();   // changed Character → Integer
        int count = 0;

        stack.push(-1);   // base index

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);   // push index of '('
            } 
            else {
                stack.pop();     // pop last '('

                if (stack.isEmpty()) {
                    stack.push(i);    // reset base
                } else {
                    count = Math.max(count, i - stack.peek());
                }
            }
        }
        return count;    // removed wrong return
    }
}
