class LC_165_Candy {
    public int candy(int[] ratings) {
        //Brute force using slope method
        int sum=1;
        int i=1;
        int n=ratings.length;
        while(i<n)
        {
            if(ratings[i]==ratings[i-1])
            {
                sum+=1;
                i++;
                continue;
            }
            int peak=1;
            while(i<n && ratings[i]>ratings[i-1])
            {
                peak++;
                sum+=peak;
                i++;
            }
            int down=1;
            while(i<n && ratings[i]<ratings[i-1])
            {
                sum+=down;
                down++;
                i++;
            }
            if(peak<down)
            {
                sum+=down-peak;
            }
        }
        return sum;
    }
}
//TC=O(N)
//SC=O(1)
