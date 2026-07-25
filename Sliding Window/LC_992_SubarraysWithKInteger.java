class LC_992_SubarraysWithKInteger {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return c(nums,k)-c(nums,k-1);
    }
    int c (int[] nums,int k)
    {
        int count=0;
        int l=0;
        int r=0;
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        while(r<n)
        {
            hash.put(nums[r],hash.getOrDefault(nums[r],0)+1);
            if(hash.get(nums[r])==1) k--;
            while(k<0)
            {
                hash.put(nums[l],hash.get(nums[l])-1);
                if(hash.get(nums[l])==0)
                {
                    k++;
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}