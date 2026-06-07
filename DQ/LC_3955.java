class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        backtrack(0,n,k,0,new StringBuilder(),ans);
        return ans;
    }
    void backtrack(int idx,int n,int k,int cost,StringBuilder curr,List<String> ans)
    {
        if(cost>k) return;
        if(idx==n)
        {
            ans.add(curr.toString());
            return;
        }
        curr.append('0');
        backtrack(idx+1,n,k,cost,curr,ans);
        curr.deleteCharAt(curr.length()-1);
        if(curr.length()==0 || curr.charAt(curr.length()-1)!='1')
        {
            curr.append('1');
            backtrack(idx+1,n,k,cost+idx,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    
}