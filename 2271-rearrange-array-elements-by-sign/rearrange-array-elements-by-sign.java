class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n =nums.length;
       int a[] = new int[n]; // Initialize array 'a' with size n
for (int i = 0; i < n; i++) {
    a[i] = nums[i]; // Copy elements from nums to a
}
        int pos=0;
        int neg=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(a[i]>0)
            {
                nums[pos]=a[i];
                  pos= pos+2;
            }
            else
            {
                nums[neg]=a[i];
                neg=neg+2;
            }
    }
                return nums;
}
}