class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] a1 = new int[m];
        int[] a2 = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    a1[i] = 1;
                    a2[j] = 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(a1[i] == 1 || a2[j] == 1){
                    matrix[i][j] = 0;
                }

            }
        }
    }
}