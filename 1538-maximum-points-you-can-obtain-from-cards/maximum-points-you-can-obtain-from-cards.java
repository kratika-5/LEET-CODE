class Solution {
    public int maxScore(int[] cp, int k) {
        int n = cp.length;
        
        // take first k elements as initial sum
        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += cp[i];
        }
        
        int maxScore = leftSum;
        int rightSum = 0;
        
        // now slide: remove from left, add from right
        for (int i = 0; i < k; i++) {
            leftSum -= cp[k - 1 - i];   // remove one from left
            rightSum += cp[n - 1 - i];  // add one from right
            maxScore = Math.max(maxScore, leftSum + rightSum);
        }
        
        return maxScore;
    }
}
