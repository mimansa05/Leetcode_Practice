class Solution {
    public boolean isThree(int n) {
        int a = 2;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                a++;
            }
        }

        return a == 3;
    }
}