class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxvol = Integer.MIN_VALUE;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int h = Math.min(height[left],height[right]);
            int diff = right - left;
            int vol = diff * h;
            maxvol = Math.max(vol,maxvol);
           if(height[left] < height[right]){
            left++;
           }else{
            right--;
           }
        }
        return maxvol;
    }
}