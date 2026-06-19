class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        // OBJECT (ArrayList): holds all the keys (unique numbers) from the map
        keys.sort((a,b) -> map.get(b) - map.get(a));
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < k; i++){
            list.add(keys.get(i));
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;


        
    }
}