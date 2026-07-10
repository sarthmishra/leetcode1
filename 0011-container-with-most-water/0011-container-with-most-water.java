class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int temp = 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int diff = right - left;
            int water = h * diff;
            temp = Math.max(temp,water);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return temp;
    }
}