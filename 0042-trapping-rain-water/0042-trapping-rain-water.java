class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
       
        

            leftmax[0] = height[0];
            for(int j = 1; j < n; j++){
                leftmax[j] = Math.max(leftmax[j-1],height[j]);
            }
             rightmax[n-1] = height[n-1];
            for(int j = n-2; j >= 0; j--){
                rightmax[j] = Math.max(rightmax[j+1], height[j]);
            }
           
             int water = 0;
            for(int j = 0; j < n; j++){
                 water += Math.min(leftmax[j],rightmax[j]) - height[j];
        }
        return water;
    }
}