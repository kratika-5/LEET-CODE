class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update min so far
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}