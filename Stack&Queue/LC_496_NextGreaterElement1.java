import java.util.*;
class LC_496_NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int n=nums2.length;
        int ans[]=new int[n];
        int j=n-1;
        while(n>0)
        {
            if(s.isEmpty())
            {
                ans[j]=-1;
                s.push(nums2[j]);
                j--;
                n--;
            }
            else if(s.peek()>nums2[j])
            {
                ans[j]=s.peek();
                s.push(nums2[j]);
                j--;
                n--;
            }
            else
            {
                s.pop();
            }
        }
        int l[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
           for( j=0;j<nums2.length;j++)
           {
            if(nums1[i]==nums2[j])
            {
                l[i]=ans[j];
                break;
            }
           }
        }
        return l;
    }
}