class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        int i = 0, j = 0;
        while(i < n && j < n){
            if(heights[i] != expected[i]){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}