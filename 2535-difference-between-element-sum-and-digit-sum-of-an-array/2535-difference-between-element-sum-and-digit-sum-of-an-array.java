class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        int dSum = 0;
        for(int i = 0; i < n; i++){
            arrSum += nums[i];

            while(nums[i] != 0){
                if(nums[i] > 0){
                    int sum = nums[i] % 10;
                    dSum += sum;
                    nums[i] /= 10;
                }
            }
        }
        return arrSum - dSum;
    }
}