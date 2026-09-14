class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];

        for(int right = 1; right < n; right++){
            if(nums[right-1] < nums[right]){
                sum += nums[right];
            }
            else{
                sum = nums[right];
            }
            maxSum = Math.max(sum,maxSum);
            
        }
        return maxSum;
    }
}