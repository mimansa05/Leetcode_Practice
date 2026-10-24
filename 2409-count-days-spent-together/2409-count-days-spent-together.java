class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa=date(arriveAlice);
            int al=date(leaveAlice);
            int ba=date(arriveBob);
            int bl=date(leaveBob);
            return Math.max(0, Math.min(al, bl) - Math.max(aa, ba) + 1);
    }
    int date(String s)
    {
       int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3, 5));

        for (int i = 0; i < m - 1; i++) {
            d += days[i];
        }

        return d;
    }
}