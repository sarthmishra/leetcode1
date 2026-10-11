class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int vol= 0;
        int maxVol = 0;
        while(left < right){
        int minHeight = Math.min(height[left],height[right]);
        int dist = right - left;
            vol = minHeight * dist;
            
            maxVol = Math.max(vol,maxVol);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxVol;
    }
}