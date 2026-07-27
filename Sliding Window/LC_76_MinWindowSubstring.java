class LC_76_MinWindowSubstring {
    public String minWindow(String s, String t) {
        //insertion means reduction
        int n = s.length();
        int m = t.length();

        int[] hash = new int[256];

        // Store frequency of characters in t
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int l = 0;
        int r = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;

        while (r < n) {

            // Include current character
            if (hash[s.charAt(r)] > 0) {
                cnt++;
            }
            hash[s.charAt(r)]--;

            // Try to shrink the window
            while (cnt == m) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;
                }

                hash[s.charAt(l)]++;

                if (hash[s.charAt(l)] > 0) {
                    cnt--;
                }

                l++;
            }

            r++;
        }

        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
}