class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int write = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }
}