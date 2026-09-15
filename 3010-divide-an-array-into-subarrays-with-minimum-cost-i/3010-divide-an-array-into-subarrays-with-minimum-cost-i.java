class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int max = 0;
        Arrays.sort(nums, 1, n);
        int sum = nums[0] + nums[1] + nums[2];
        return sum;
    }
}