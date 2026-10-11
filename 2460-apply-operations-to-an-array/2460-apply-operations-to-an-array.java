class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] == 0){
                continue;
            }
            if(nums[i] == nums[i + 1]){
                ans[index] = nums[i]*2;
                nums[i+1] = 0;
                index++;
            }else{
                ans[index] = nums[i];
                index++;
            }
        }
        if(nums[n-1] != 0 && nums[n-1] != nums[n-2]){
            ans[index] = nums[n-1];
            index++;
        }
        while(index < n-1){
            ans[index] = 0;
            index++;
        }
        return ans;
    }
}