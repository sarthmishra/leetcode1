class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                    ans[left] = nums[i];
                    left += 2;
            }else{
                    ans[right] = nums[i];
                    right -= 2;
                }
            }
        
        return ans;
    }
}