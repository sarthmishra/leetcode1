class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        
        int count = 0;
        for(int i = 0; i < n-1; i++){
            int rightSum = 0;
            int leftSum = 0;

            for(int j = 0; j <= i; j++){
                leftSum += nums[j];
            }
            for(int l = i+1; l < n; l++){
                rightSum += nums[l];
            }
            int diff = Math.abs(leftSum - rightSum);
            if(diff % 2 == 0){
                count++;
            }
        }
        return count;
    }
}