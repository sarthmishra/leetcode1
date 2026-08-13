class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        if(set.size() != n){
            return true;
        }
        return false;
    }
}