class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                list.add(entry.getKey());

            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
            int ans = 0;
            for(int i = 0; i < arr.length; i++){
                ans ^= arr[i];
            }
        return ans;
    }
}