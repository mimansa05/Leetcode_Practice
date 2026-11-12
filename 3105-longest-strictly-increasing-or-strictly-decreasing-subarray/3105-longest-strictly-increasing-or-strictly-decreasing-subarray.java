class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i=0;
        int len=1;
        int cen=1;
        int maxi1=1;
        int maxi2=1;
        while(i<nums.length-1)
        {
           if(nums[i]>nums[i+1])
           {
              len++;
              cen=1;
              maxi1=Math.max(len,maxi1);
           }

           else if(nums[i]<nums[i+1])
           {
              cen++;
              len=1;
              maxi2=Math.max(cen,maxi2);
           }
           else {
            cen=1;
            len=1;
            //break;
           }
           i++;
        }
        return Math.max(maxi1,maxi2);
    }
}