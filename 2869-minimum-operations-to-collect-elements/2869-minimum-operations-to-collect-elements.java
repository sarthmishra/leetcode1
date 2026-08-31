class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = nums.size();
        HashSet<Integer> set = new HashSet<>();
        for(int i = n -1; i >= 0; i--){
            if(nums.get(i) <= k){
                set.add(nums.get(i));
                if(set.size() == k){
                    return n -i;
                }
            }
        }
        return n;
    }
}