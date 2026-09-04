class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums.get(i);
        }
        int left = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] + arr[j] < target && i != j && i < j ){
                    count++;
                }
            }
        }
        return count;
    }
}