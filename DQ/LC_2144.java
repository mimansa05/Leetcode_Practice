class LC_2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int sum=0;
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            count++;
            if(count%3!=0)
            {
                sum+=cost[i];
            }
        }
        return sum;
    }
}