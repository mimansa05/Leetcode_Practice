package Math;

class LC_202_HappyNumber {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=sum+(d*d);
            n=n/10;
        }
        if(sum==1) return true;
        if(sum==4) return false;
        return isHappy(sum);
    }
}