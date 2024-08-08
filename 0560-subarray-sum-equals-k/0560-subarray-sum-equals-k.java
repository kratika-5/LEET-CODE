class Solution {
    public int subarraySum(int[] nums, int k) {
        int i,j,flag=0;
        for(i=0;i<nums.length;i++)
        { int sum=0;
            for(j=i;j<nums.length;j++)
               
            {
                sum+=nums[j];
                    if(sum==k)
                    flag++;
        }
        }
        return flag;
        
    
}
}