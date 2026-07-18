import java.util.Arrays;
class LC_1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int r=0;
        while(b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}