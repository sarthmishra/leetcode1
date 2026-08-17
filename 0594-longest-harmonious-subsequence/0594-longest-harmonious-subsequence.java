class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        int maxlen = 0;
        int len = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            if(map.containsKey(num + 1)){
                len = map.get(num) + map.get(num + 1);
                maxlen = Math.max(maxlen,len);
            }
            
        }
        return maxlen;
    }
}