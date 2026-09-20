class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int rev='z'-ch+1;
            sum+=rev*(i+1);
        }
        return sum;
    }
}