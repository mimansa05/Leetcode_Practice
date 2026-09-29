class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        else return solve(n);
    }
    boolean solve(int n)
    {
        if(n<=0) return false;
        if(n==1) return true;
        if(n%4!=0) return false;
        else return solve(n/4);
    }
}