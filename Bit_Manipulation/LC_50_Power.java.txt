class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        double ans=1.0;
         if(nn<0)
        {
            x=1/x;
            nn=-nn;
        }
        if(nn<0)
        {
            nn=-1*nn;
        }
        while(nn>0)
        {
            if(nn%2==1)
            {
                ans*=x;
                nn-=1;
            }
            else
            {
                x*=x;
                nn>>=1;
            }
        }
        return ans;
    }
}