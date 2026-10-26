class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        //1st check if there if no overlapping
        //curr [end]< new[start]
        while(i<n && intervals[i][1]<newInterval[0])
        {
            res.add(intervals[i]);
            i++;
        }
        //if overlapp occurs
        //curr [start]<new[end] while loop me
        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        //add rest of the part
        while(i<n)
        {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[0][]);
    }
}