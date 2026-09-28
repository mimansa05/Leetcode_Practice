class Solution {
    public void reverseString(char[] s) {
        rev(0,s.length-1,s);
    }
    void rev(int i,int j,char[] s)
    {
        if(i>=j) return;
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        rev(i+1,j-1,s);
    }
}