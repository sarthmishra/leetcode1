class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int length = 0;
        int minlength = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right < n; right++){
            
            sum += nums[right];
            length = right - left + 1;
            

            while(target <= sum){
                minlength = Math.min(minlength,length); 
                sum -= nums[left];
                left++;
                length--;
                
            }
        }
        return minlength == Integer.MAX_VALUE ? 0 : minlength;
    }
}