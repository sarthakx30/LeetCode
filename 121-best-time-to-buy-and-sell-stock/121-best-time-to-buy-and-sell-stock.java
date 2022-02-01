class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buyPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            buyPrice=Math.min(buyPrice,prices[i]);
            max=Math.max(max,prices[i]-buyPrice);
        }
        return max;
    }
}