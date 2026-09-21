class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }
        if(totalSum % 2 == 0){
            return n-1;
        }
        return 0;
    }
}