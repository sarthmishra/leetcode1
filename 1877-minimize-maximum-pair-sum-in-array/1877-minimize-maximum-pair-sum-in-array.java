class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxPairSum = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int currsum = nums[left] + nums[right];
            maxPairSum = Math.max(maxPairSum,currsum);
            left++;
            right--;
        }
        return maxPairSum;
    }
}