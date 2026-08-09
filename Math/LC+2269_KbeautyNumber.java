class LC_2269_KbeautyNumber {
    public int divisorSubstrings(int num, int k) {
        String n = Integer.toString(num);
        int len = n.length();
        int count = 0;

        for (int i = 0; i <= len - k; i++) {
            String sub = n.substring(i, i + k);
            int c = Integer.parseInt(sub);

            if (c != 0 && num % c == 0) {
                count++;
            }
        }

        return count;
    }
}