class LC_2427_CommonFactors {
    public int commonFactors(int a, int b) {
        int d=Math.min(a,b);
        int count=1;
        for(int i=2;i<=d;i++)
        {
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}