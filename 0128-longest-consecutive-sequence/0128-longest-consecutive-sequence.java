class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int countstreak = 0;
        int maxlen = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                countstreak = 1;
            
            while(set.contains(currentNum+ 1)){
                currentNum++;
                countstreak++; 
            }
            maxlen = Math.max(maxlen,countstreak);
            }
        }
        return maxlen;
    }
}