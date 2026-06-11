class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean a[]=new boolean[nums.length+1];
        int ans[]={0,0};
        for(int x:nums){
            if(a[x]==true){
                ans[0]=x;
            }else{
                a[x]=true;
            }
        }
        for(int i=1;i<a.length;i++){
            if(a[i]==false) ans[1]=i;
        }
        return ans;
    }
}
