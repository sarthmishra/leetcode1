class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
       int[][] arr = new int[n][2];
       for(int i = 0; i < n; i++){
        arr[i][0] = nums[i];
        arr[i][1] = i;
       }
       java.util.Arrays.sort(arr,(a,b) -> {
        if(a[0] != b[0]){
            return Integer.compare(a[0], b[0]);
        }
        return Integer.compare(a[1], b[1]);
       });
       boolean[] marked = new boolean[n];
    long score = 0;
    for(int i = 0; i < n; i++){
        int val = arr[i][0];
        int idx = arr[i][1];
    
    if (marked[idx]) {
        continue;
     }
     score += val;
     marked[idx] = true;
     if(idx > 0){
        marked[idx - 1] = true;
     }
     if(idx < n-1){
        marked[idx + 1] = true;
            }
        }
        return score;

    }
}