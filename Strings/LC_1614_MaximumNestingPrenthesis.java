class LC_1614_MaximumNestingPrenthesis {
    public int maxDepth(String s) {
        int max=-9999;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                count++;
            }
            else if(ch==')')
            {
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
