class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int [nums1.length];
      for (int i = 0; i < nums1.length; i++) {
    int k = nums1[i];
    boolean found = false;
    for (int j = 0; j < nums2.length; j++) {
        if (nums2[j] == k) {
            found = true;
        }
        if (found && nums2[j] > k) {
            arr[i] = nums2[j];
            break;
        }
    }
    if (!found || arr[i] == 0) {
        arr[i] = -1;
    }
}

        return arr;
    }
}