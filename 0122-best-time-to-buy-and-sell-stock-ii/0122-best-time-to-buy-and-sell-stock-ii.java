class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int count = 0;
        int minprice = prices[0];
        int totalprofit = 0;
        for(int i = 1; i < n; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
            totalprofit = prices[i] - minprice;
            count += totalprofit;
            totalprofit = 0;
            minprice = prices[i];
        }
        return count;
    }
}