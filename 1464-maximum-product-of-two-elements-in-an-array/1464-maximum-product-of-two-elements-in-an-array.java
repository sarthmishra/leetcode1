class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = 0;
        int prod = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+ 1; j < n; j++){
                prod = nums[i] -1;
                prod = prod * (nums[j]-1);
                maxProd = Math.max(prod,maxProd);
            }
        
        }
        return maxProd;
    }
}