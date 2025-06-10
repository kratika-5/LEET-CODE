class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Make sure mid is even so we compare with the next index
            if (mid % 2 == 1) {
                mid--;
            }

            // If pair is valid, move search to the right half
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // If pair is broken, move search to the left half (including mid)
                right = mid;
            }
        }

        // When left == right, we've found the single element
        return nums[left];
    }
}
