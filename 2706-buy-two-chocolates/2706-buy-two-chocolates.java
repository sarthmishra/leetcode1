class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        int left = 0;
        left = money - prices[0];
        left = left - prices[1];
        if(left >= 0){
            return left;
        }
        return money;
    }
}