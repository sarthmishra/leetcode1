class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] copy = nums.clone();
        int[] freq = new int[101];
        Arrays.sort(copy);
        for(int num  :nums){
            freq[num]++;
        }
        
        int index = 0;
        while(index < n){
            for(int i = 0 ; i < freq.length; i++){
                if(freq[i] > 0){
                    ans[index] = i;
                    index++;
                }
                freq[i]--;
            }
        }
        return ans;
    }
}