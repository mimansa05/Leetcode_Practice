class LC_29_Divide2Integers {
    public int divide(int dividend, int divisor) {
        //Optimal solution
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(dividend==divisor) return 1;
        boolean sign=true;
        if(dividend>=0 && divisor<=0) sign=false;
        if(dividend<=0 && divisor>=0) sign=false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int ans=0;
        while(n>=d)
        {
            int count=0;
            while(n>=(d<<(count+1)))
            {
                count++;
            }
            ans+=1<<count;
            n=n-(d<<count);
        }
        return sign?ans:(-1*ans);
    }
}
