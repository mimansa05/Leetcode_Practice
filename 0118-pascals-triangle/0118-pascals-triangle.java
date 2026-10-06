class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    int curr[][];
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        curr=new int[n][n];
        solve(0,0,n);
        return ans;
    }
    void solve(int row,int col,int n)
    {
        if(row==n)
        {
            return;
        }
        if(row==col)
        {
            curr[row][col]=1;
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<=row;i++)
            {
                temp.add(curr[row][i]);
            }
            ans.add(temp);
            solve(row+1,0,n);
            return;
        }
        if(col==0)
        {
            curr[row][col]=1;
        }
        else
        {
            curr[row][col]=curr[row-1][col-1]+curr[row-1][col];
        }
        solve(row,col+1,n);
    }
}