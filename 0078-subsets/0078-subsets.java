class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(0,nums,nums.length,new ArrayList<>());
        return ans;
        
    }
    void solve(int ind,int[] nums,int n,ArrayList<Integer> current)
    {
        if(ind==n)
        {
            ans.add(new ArrayList<>(current));
            return;
        } 
        //take
        current.add(nums[ind]);
        solve(ind+1,nums,n,current);

        //not take
        current.remove(current.size()-1);//----> remove current element from list
        solve(ind+1,nums,n,current);
    }
}