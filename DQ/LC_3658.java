class LC_3658 {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int i = 1;
        int c1 = n;
        int c2 = n;
        int c = 0;

        while (c1 > 0 || c2 > 0) {
            if (i % 2 == 0 && c2 > 0) {
                sumEven += i;
                c2--;
            } else if (i % 2 != 0 && c1 > 0) {
                sumOdd += i;
                c1--;
            }
            i++;
        }

        int s = Math.min(sumEven, sumOdd);
        int b = Math.max(sumEven, sumOdd);

        while (s != 0) {
            c = b % s;
            b = s;
            s = c;
        }

        return b;
    }
}