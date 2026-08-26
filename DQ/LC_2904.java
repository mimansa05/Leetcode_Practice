class LC_2904 {

    public String shortestBeautifulSubstring(String s, int k) {

        int i = 0;
        int j = 0;
        int n = s.length();

        int count = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";

        while (j < n) {

            char ch = s.charAt(j);

            if (ch == '1') {
                count++;
            }

            while (count == k) {

                String sub = s.substring(i, j + 1);
                int len = sub.length();

                if (len < min || (len == min && sub.compareTo(ans) < 0)) {
                    min = len;
                    ans = sub;
                }

                if (s.charAt(i) == '1') {
                    count--;
                }

                i++;
            }

            j++;
        }

        return ans;
    }
}