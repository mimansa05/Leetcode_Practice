class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        boolean[] used=new boolean[nums.length];
        solve(used,nums,new ArrayList<>(),set);
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
    void solve(boolean used[],int[] nums,ArrayList<Integer> temp,HashSet<List<Integer>> set)
    {
        if(temp.size()==nums.length)
        {
            set.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]) continue;
            temp.add(nums[i]);
            used[i]=true;
            solve(used,nums,temp,set);
            used[i]=false;

            temp.remove(temp.size()-1);
        }
       
    }
}