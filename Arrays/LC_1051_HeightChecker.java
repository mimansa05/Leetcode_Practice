import java.util.*;
class LC_1051_HeightChecker {
    public int heightChecker(int[] heights) {
        int c=0;
        int n=heights.length;
        int e[]=new int[n];
        for(int i=0;i<n;i++)
        {
            e[i]=heights[i];
        }
        Arrays.sort(e);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=e[i]) c++;
        }
        return c;
    }
}