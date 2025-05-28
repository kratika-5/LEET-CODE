class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
       int current=0;
       int upcoming=0;
   
         for (int num : nums) 
       {
           if(num==1)
           {   current++;
            upcoming=Math.max(upcoming,current);
           }
             else
             {
              
                current=0;
             }    

       }
      
       return upcoming;
    }
    
}
