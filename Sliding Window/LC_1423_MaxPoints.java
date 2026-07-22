class LC_1423_MaxPoints {
    public int maxScore(int[] cardPoints, int k) {
        int l=k-1;
        int n=cardPoints.length;
        int r=n-1;
        int sum1=0;
        int sum2=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum1+=cardPoints[i];
        }
        sum+=sum1;
        for(int i=0;i<k;i++)
        {
            sum1-=cardPoints[l];
            sum2+=cardPoints[r];
            r--;
            l--;
            sum=Math.max(sum,sum1+sum2);
        }
        
        return sum;      
    }
}