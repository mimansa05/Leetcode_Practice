import java.util.Arrays;
class LC_1732 {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int ans[]=new int[n+1];
        ans[0]=0;
        ans[1]=gain[0];
        int i=2;
        for(int j=1;j<n;j++)
        {
            ans[i]=gain[j]+ans[i-1];
            i++;
        }
        Arrays.sort(ans);
        return ans[n];
    }
}