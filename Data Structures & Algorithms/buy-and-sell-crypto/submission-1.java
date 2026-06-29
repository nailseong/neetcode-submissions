class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int max = -1;
        for(int r = 0; r < prices.length; r++) {
            int profit = prices[r] - prices[l];
            max = Math.max(max, profit);
            if (prices[r] < prices[l]) {
                l = r;
            }
        }
        return max;
    }
}
