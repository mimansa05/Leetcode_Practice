class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean used[]=new boolean[nums.length];
        solve(used,nums,new ArrayList<>());
        return ans;
    }
    void solve(boolean[] used,int[] nums,ArrayList<Integer> temp)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]) continue;
            //add
            temp.add(nums[i]);
            used[i]=true;
            solve(used,nums,temp);

            //undo
            used[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}