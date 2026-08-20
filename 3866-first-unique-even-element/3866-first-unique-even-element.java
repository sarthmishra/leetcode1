class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getKey() % 2 == 0 && entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}