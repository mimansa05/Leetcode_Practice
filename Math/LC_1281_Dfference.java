class LC_1281_Dfference {
    public int subtractProductAndSum(int n) {
        int p=1;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            p*=d;
            sum+=d;
            n=n/10;
        }
        return (p-sum);
    }
}