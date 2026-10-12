class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        Arrays.sort(nums);
        int max = 0;
        while(left < right){
            int currMax = (nums[left] + nums[right]);
            max = Math.max(max,currMax);
            left++;
            right--;

        }
        return max;
    }
}