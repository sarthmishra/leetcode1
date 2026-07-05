class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            ans[i] = prices[i];
            for(int j = i + 1; j < n; j++){
                if(prices[j] <= prices[i]){
                    int discount = prices[i] - prices[j];
                    ans[i] = discount;
                    break;
                }
            }
        }
        return ans;
    }
}