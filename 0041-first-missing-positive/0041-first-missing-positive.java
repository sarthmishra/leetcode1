class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i = 1; i <= n; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return n+1;
    }
}