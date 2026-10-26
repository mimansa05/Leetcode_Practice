class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sort array acc to end time
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=0;
        int n=intervals.length;
        //store previous end
        int prev=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            //if start of current <= end of previous
            if(intervals[i][0]<prev) count++;
            else
            {
                prev=intervals[i][1];
            }
        }
        return count;
    }
}