class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        return solve(n);
    }
    boolean solve(int n)
    {
        if(n==0) return true;
        if(n==1) return true;
        else if(n%2!=0) return false;
        else return solve(n/2);
    }
}