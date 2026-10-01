class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(int j = top; j <= bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}