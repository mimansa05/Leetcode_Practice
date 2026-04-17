class LC_1922_CountGoodNum {
    public int countGoodNumbers(long n) {
    int mod=1000000007;
    long even;
    long odd;
    even=(n+1)/2;
    odd=n/2;
    long even_times=power(5,even,mod);
    long odd_times=power(4,odd,mod);
    long total=(even_times*odd_times)%mod;
    return (int) total;
    }
    long power(long x,long n,int mod)
    {
        long power=n;
        long ans=1;
        x=x%mod;
        while(power>0)
        {
            if((power&1)==1)
            {
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            power>>=1;
        }
        return ans;
    }
}
