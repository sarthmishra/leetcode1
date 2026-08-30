class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            else if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        int front = Math.max(minIndex, maxIndex) + 1;
        int back = n - Math.min(minIndex, maxIndex);
        int both = (Math.min(minIndex, maxIndex) + 1) + (n - Math.max(minIndex, maxIndex));
        return Math.min(Math.min(front, back), both);
    }
}