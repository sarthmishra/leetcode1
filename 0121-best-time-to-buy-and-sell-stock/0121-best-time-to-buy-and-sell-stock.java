class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int maxProfit = 0;
        int currProfit = 0;
        int currNum = prices[0];
        for(int right = 1; right < n; right++){
            if(prices[right] < currNum){
                currNum = prices[right];
            }
            currProfit = prices[right] - currNum;
            maxProfit = Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }
}