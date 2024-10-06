public class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: if there are less than 2 days, no transactions can be made
        if (prices.length < 2) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE; // To track the minimum price
        int maxProfit = 0;                // To track the maximum profit
        
        // Iterate over the prices
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price encountered so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            
            // Calculate the current profit by selling at day i
            int currentProfit = prices[i] - minPrice;
            
            // Update maxProfit if the current profit is higher
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        
        return maxProfit;
    }

    
}
