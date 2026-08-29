class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sec = -1;
        int maxIndex = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > max){
                sec = max;
                max = nums[i];
                maxIndex = i;
            }
            else if(nums[i] > sec && nums[i] != max){
                sec = nums[i];
            }
        }
         if(max >= 2 * sec){
            return maxIndex;
        }
        return -1;
    }
}