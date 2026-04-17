class LC_1482_MinNumBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)(m*k)>bloomDay.length) return -1;
        int minDay=Integer.MAX_VALUE;
        int maxDay=Integer.MIN_VALUE;
        for(int bloom:bloomDay)
        {
            minDay=Math.min(minDay,bloom);
            maxDay=Math.max(maxDay,bloom);
        }
        int low=minDay;
        int high=maxDay;
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(bloomDay,m,k,mid)==true)
            {
                result=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return result;
    }
    boolean possible(int[] bloomDay,int m,int k,int day)
    {
        int count=0;
        int noB=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            {
                count++;
            }
            else
            {
                noB+=(count/k);
                count=0;
            }
        }
        noB+=(count/k);
        return noB>=m;
    }
}
