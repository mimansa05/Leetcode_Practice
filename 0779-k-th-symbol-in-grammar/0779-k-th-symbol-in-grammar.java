class Solution {
    public int kthGrammar(int n, int k) {
       return solve(n,k); 
    }
    int solve(int n,int k)
    {
        if(n==1) return 0;
        int pk=(k+1)/2;
        if(k%2==0)//even---> value flip
        {
            return 1-solve(n-1,pk);
        }
        //odd---> same
        return solve(n-1,pk);
    }
}