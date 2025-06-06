class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // prevent overflow

            if (nums[mid] == target) {
                return mid;  // found
            } else if (nums[mid] < target) {
                left = mid + 1;  // search right
            } else {
                right = mid - 1;  // search left
            }
        }

        return -1;  // not found
    }
}
