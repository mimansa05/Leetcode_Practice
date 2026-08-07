class LC_2520_CountDigitsDivide {
    public int countDigits(int num) {
        int t=num;
        int count=0;
        while(num>0)
        {
            int d=num%10;
            if(t%d==0) count++;
            num=num/10;
        }
        return count;
    }
}