class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(0,candidates,target,new ArrayList<>());
        return ans;
    }
    void solve(int ind,int[] candidates,int target,ArrayList<Integer> temp)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        //ans.add(new ArrayList<>(temp));
        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],temp);

            temp.remove(temp.size()-1);
        }

    }
}