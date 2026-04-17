class LC_50_PowUsingRecursion {
    public double myPow(double x, int n) {
        //Using Recursion
        long num=n;
        if(num<0)
        {
           return 1.0/ Power(x,-num);
        }
        return Power(x,num);
    }
    double Power(double x,long n)
    {
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0)
        {
            return Power(x*x,n/2);
        }
        else
        {
            return x*Power(x,n-1);
        }
    }
}
