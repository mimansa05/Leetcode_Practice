class LC_3345 {
    public int smallestNumber(int n, int t) {
        int res=n;
        while(res>=n)
        {
            if(prod(res)%t==0) 
            {
                break;
            }
            res++;
        }
        return res;
    }
    int prod(int n)
    {
        int p=1;
        while(n>0)
        {
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        return p;
    }
}