class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        solve(0,nums,new ArrayList<>(),n);
        return ans;
    }
    void solve(int ind,int[] nums,ArrayList<Integer> cur,int n)
    {
        if(ans.contains(cur)) return;
        ans.add(new ArrayList<>(cur));
        for(int i=ind;i<n;i++)
        { 
            if(i>ind && nums[i]==nums[i-1]) continue;
            cur.add(nums[i]);
            solve(i+1,nums,cur,n);

            cur.remove(cur.size()-1);
        }
    }
}