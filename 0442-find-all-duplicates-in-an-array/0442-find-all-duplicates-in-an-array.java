class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                ans.add(key);
            }
        }
        return ans;
    }
}