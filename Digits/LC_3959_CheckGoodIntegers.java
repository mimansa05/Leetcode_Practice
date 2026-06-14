class Solution {
    public boolean checkGoodInteger(int n) {
        int digisum=0;
        int sqrsum=0;
        while(n>0)
            {
                int d=n%10;
                digisum+=d;
                sqrsum+=d*d;
                n=n/10;
            }
        return sqrsum-digisum>=50;
    }
}