
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                // Agar next character ')' hai,
                // toh dono ko ek pair maan lo
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Ek ')' insert karna padega
                    ans++;
                }

                // Is closing pair ke liye '(' chahiye
                if (open > 0) {
                    open--;
                } else {
                    // Ek '(' insert karna padega
                    ans++;
                }
            }
        }

        return ans + 2 * open;
    }
}
