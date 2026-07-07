class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>ans = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key) >= 2){
                ans.add(key);
            }
        }
    return ans;
    }
}