class LC_151_ReverseString {
    public String reverseWords(String s) {
        String w = "";
        s = s.trim();
        int j = s.length() - 1;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch == ' ' && i < j) {
                w = w + s.substring(i + 1, j + 1) + " ";
                while(i > 0 && s.charAt(i - 1) == ' ') {
                    i--;
                }
                j = i - 1;
            }
        }
        w = w + s.substring(0, j + 1);
        return w;
    }
}
