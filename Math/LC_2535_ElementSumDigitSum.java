class LC_2535_ElementSumDigitSum {
    public int differenceOfSum(int[] nums) {
        int sumele=0;
        int sumdigi=0;
        for(int x:nums)
        {
            sumele+=x;
            sumdigi+=digisum(x);
        }
        return Math.abs(sumele-sumdigi);
    }
    int digisum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}