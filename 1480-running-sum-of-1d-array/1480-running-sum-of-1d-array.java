class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;
        int sum = 0;
        while(i < n){
            sum += nums[i];
            ans[i] = sum;
            i++;
        }
        
            
        
        

        return ans;
    }
}