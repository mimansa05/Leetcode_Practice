class LC_2729_FascinatingNumber {
    public boolean isFascinating(int n) {
        int a=2*n;
        int b=3*n;
        String s=Integer.toString(n)+Integer.toString(a)+Integer.toString(b);
        Long m=Long.parseLong(s);
        long arr[]=new long[10];
        Arrays.fill(arr,-1);
        while(m>0)
        {
            int d=(int)(m%10);
            if(d==0 || arr[d]==1) return false;
            arr[d]=1;
            m=m/10;
        }
        for(int i=1;i<10;i++)
        {
            if(arr[i]!=1) return false;
        }
        return true;
    }
}