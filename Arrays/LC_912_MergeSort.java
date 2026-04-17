class LC_912_MergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(0,nums.length-1,nums);
        return nums;
    }
    void mergeSort(int low,int high,int[] nums)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(low,mid,nums);
            mergeSort(mid+1,high,nums);
            merge(nums,low,mid,high);
        }

    }
    void merge(int nums[],int low,int mid,int high)
    {
        int b[]=new int[nums.length];
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high)
        {
            if(nums[i]<=nums[j])
            {
                b[k]=nums[i];
                i++;
            }
            else
            {
                b[k]=nums[j];
                j++;
            }
            k++;
        }
            while(i<=mid)
            {
                b[k]=nums[i];
                i++;
                k++;
            }
            while(j<=high)
            {
                b[k]=nums[j];
                j++;
                k++;
            }
            for(i=low;i<=high;i++)
            {
                nums[i]=b[i];
            }
    }
}
