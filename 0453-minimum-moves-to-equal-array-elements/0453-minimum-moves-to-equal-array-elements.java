class Solution {
    public int minMoves(int[] nums) {
        int diff = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int min = nums[0];
        for(int i = 0; i < n; i++){
            diff += Math.abs(min - nums[i]);
        }
        return diff;
    }
}