class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        return solve(m-1,n-1,grid);
    }
    int solve(int i,int j,int grid[][])
    {
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[0][0];
        int up=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(i>0) up=grid[i][j]+solve(i-1,j,grid);
        if(j>0) left=grid[i][j]+solve(i,j-1,grid);
        return Math.min(up,left);
    }
}