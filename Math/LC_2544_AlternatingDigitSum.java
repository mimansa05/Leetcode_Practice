class LC_2544_AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int l=s.length();
        int a=0;
        int b=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(i%2==0)
            {
                a+=ch-'0';
            }
            else
            {
                b+=ch-'0';
            }
        }
        return a-b;
    }
}