class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return 0;
        }
        Arrays.sort(nums);
        int diff = 0;
        for(int i = 0; i < n-1; i++){
            diff = Math.max(diff,-1 * (nums[i] - nums[i+1]));
        }
        return diff;
    }
}