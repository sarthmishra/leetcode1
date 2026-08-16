class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a));
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(keys.get(i));
        }
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            ans[i] = (value != null) ? value : 0; 
        }
        return ans;
    }
}