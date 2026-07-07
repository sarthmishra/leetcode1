class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        TreeSet<Integer>set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int prev = set.first();
        int count = 1;
        int max = 1;
        for(int num : set){
            if(prev == num){
                continue;
            }else if (prev + 1 == num){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
            prev = num;
        }
        return max;
        
    }
}