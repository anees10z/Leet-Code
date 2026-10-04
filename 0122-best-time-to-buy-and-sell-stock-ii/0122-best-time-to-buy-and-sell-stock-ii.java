class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                maxProfit += prices[i] - bestBuy;
                bestBuy = prices[i];
            }
            bestBuy = Math.min(prices[i], bestBuy);
        }
        return maxProfit;
    }
}