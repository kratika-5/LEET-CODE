import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums); 
       int k=0;


        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
             {  k=nums[i] ;
                return k ;  
                
        }
        }
         
           return nums[nums.length - 1];
    }

}