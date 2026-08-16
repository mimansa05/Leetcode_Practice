class LC_503_NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        //using circular array
        //[1 2 1 | 1 2 1]
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {
            int ind=i%n;
            int c=nums[ind];
            while(!st.isEmpty() && st.peek()<=c)
            {
                st.pop();
            }
            if(i<n)
            {
                ans[ind]=st.isEmpty()?-1:st.peek();
            }
            st.push(c);
        }
        return ans;
    }
}