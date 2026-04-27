public class LC_821_ShortestDistance {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int answer[]=new int[n];
        int occ[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                occ[j]=i;
                j++;
            }
        }
         j=0;
        for(int i=0;i<n;i++)
        {
            while(j<n-1 && occ[j+1]!=0 && Math.abs(occ[j+1]-i) <=Math.abs(occ[j]-i))
            {
                j++;
            }
            answer[i]=Math.abs(i-occ[j]);
        }
        return answer;
    }
}
