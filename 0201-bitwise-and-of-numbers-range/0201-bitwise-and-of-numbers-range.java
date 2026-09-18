class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //Only those bits will be left that are common in the range
/**RANGE AND
   ↓
COMMON PREFIX
   ↓
RIGHT SHIFT BOTH
   ↓
RESTORE LEFT SHIFT*/

      int shift=0;
      while(left!=right)
      {
        left >>=1;//for removing bits until bits same
        right >>=1;
        shift++;
      }
      return left << shift;// add number of bits that has been lost
    }
}