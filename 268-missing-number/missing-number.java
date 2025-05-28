class Solution {
    public int missingNumber(int[] nums) {
           int arraysum=0;
           int finalsum=0;
           int missing;

          for(int i=0;i<nums.length;i++)
          {
            arraysum+=nums[i];
          } 
          for(int i=0;i<=nums.length;i++)
          {
            finalsum+=i;
          }
          missing=finalsum-arraysum;
          return missing;
    }
}