import java.util.*;

class LC_78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        int n=nums.length;
        int subsets=1<<n;
        for(int i=0;i<=subsets-1;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<=n-1;j++)
            {
                if((i & (1<<j))!=0)
                {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
