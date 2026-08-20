import java.util.Stack;
class LC_402_RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            while (!s.isEmpty() && k > 0 && s.peek() > ch) {
                s.pop();
                k--;
            }

            s.push(ch);
        }

        // Agar abhi bhi digits remove karni hain
        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }

        // Stack ko string me convert
        StringBuilder ans = new StringBuilder();

        while (!s.isEmpty()) {
            ans.append(s.pop());
        }

        ans.reverse();

        // Leading zeroes remove
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        if (i == ans.length()) {
            return "0";
        }

        return ans.substring(i);
    }
}