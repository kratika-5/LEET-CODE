class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int k=0;
        int j=0;
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                a[k]=nums[i];
                k++;
            }
            else
            {
                b[j]=nums[i];
                j++;
            }

        }
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=b[c];
                c++;
            }
            else
            {
                 nums[i]=a[d];
                d++;
            }
        }
        return nums;
    }
}