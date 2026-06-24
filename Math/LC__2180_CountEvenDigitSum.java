class LC__2180_CountEvenDigitSum {
    public int countEven(int num) {
        int count=0;
        if(num==1) return 0;
        for(int i=2;i<=num;i++)
        {
            if(digisum(i)%2==0) count++;
        }
        return count;
    }
    int digisum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}