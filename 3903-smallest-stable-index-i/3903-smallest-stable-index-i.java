class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int res = 0;

        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j = 0; j <= i; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }for(int l = i; l < n; l++){
                if(nums[l] < min){
                    min = nums[l];
                }
            }
            res = max - min;
            if(res <= k){
                return i;
            }
        }
        return -1; 
    }
}