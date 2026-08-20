class LC_3069 {
    public int[] resultArray(int[] nums) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int n= nums.length;
        s1.push(nums[0]);
        s2.push(nums[1]);
        for(int i=2;i<n;i++)
        {
            if(s1.peek()>s2.peek())
            {
                s1.push(nums[i]);
            }
            else
            {
                s2.push(nums[i]);
            }
        }
        int res[]=new int[n];
        int a=s1.size()-1;
        while(!s1.isEmpty())
        {
            res[a]=s1.pop();
            a--;
        }
        int b=n-1;
        while(!s2.isEmpty())
        {
            res[b]=s2.pop();
            b--;
        }
        return res;

    }
}