class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        int diff = 0;
        for(int i = 1; i < n; i++){
            diff = nums[i] - nums[i-1];
            if(diff >= 2){
                return false;
            }
            if(nums[i] != max && nums[i] == nums[i-1]){
                return false;
            }
        }
        if(n == max+1){
            return true;
        }
        return false;
    }
}