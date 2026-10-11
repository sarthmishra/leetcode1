class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int[] copy = nums.clone();
        Arrays.sort(copy);
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(copy[mid] == target){
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == target){
                        return i;
                    }
                }
            }if(target < copy[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}