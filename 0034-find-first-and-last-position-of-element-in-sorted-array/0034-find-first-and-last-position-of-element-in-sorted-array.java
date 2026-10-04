class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = findFirst(nums,target);
        int second = findSecond(nums,target);
        return new int[]{first,second};
    }
    
        private int findFirst(int[] nums,int target){
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int result = -1;
            while(left <= right){
                int mid = left + (right - left/2);
                if(nums[mid] == target){
                    result = mid;
                    right = mid - 1;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
                
            }
            return result;
        }
        private int findSecond(int[] nums,int target){
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int result = -1;
            while(left <= right){
                int mid = left + (right - left/2);
                if(nums[mid] == target){
                    result = mid;
                    left = mid + 1;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
                
            }
        return result;
    }
}