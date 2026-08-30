class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
    for(int val : map.values()){
        if(val == 1){
            count++;
            }
        }
        return count;
    }
}