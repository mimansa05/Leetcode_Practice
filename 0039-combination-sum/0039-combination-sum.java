class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0,candidates,target,new ArrayList<>());
        return ans;
    }
    void solve(int ind,int[] candidates,int target,ArrayList<Integer> temp)
    {
        if(target==0) 
        {
            ans.add(new ArrayList(temp));
            return;
        }
        if(ind==candidates.length) return;
        if(candidates[ind]<=target)
        {
            temp.add(candidates[ind]);
            solve(ind,candidates,target-candidates[ind],temp);
            temp.remove(temp.size()-1);
        }
        solve(ind+1,candidates,target,temp);
    }
}