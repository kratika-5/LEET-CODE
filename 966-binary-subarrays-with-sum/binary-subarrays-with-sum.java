class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        

 return atMost(nums, goal) - atMost(nums, goal - 1);
    }
        
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

     int l=0,r=0,c=0,sum=0;
 
     while(r<nums.length)
     {
         sum=sum+nums[r];

        while(sum>goal)
        {
            sum=sum-nums[l];
            l++;
        }
        c=c+(r-l+1);
        r++;
     }
   return c;
        
    }
}