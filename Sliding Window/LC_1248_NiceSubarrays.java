class LC_1248_NiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(isOdd(nums[i])==true)
            {
                arr[i]=1;
            }
            else arr[i]=0;
        }
        return cal(arr,k)-cal(arr,k-1);
    }  
    boolean isOdd(int x)
    {
        if(x%2==0) return false;
        else return true;
    }
    int cal(int arr[],int k)
    {
        int l=0;
        int r=0;
        int count=0;
        int a=arr.length;
        int sum=0;
        if(k<0) return 0;
        while(r<a)
        {
            sum+=arr[r];
            while(sum>k)
            {
                sum-=arr[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;

    }
}