class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>list = new ArrayList<>();
       
       HashSet<Integer>set = new HashSet<>();
       for(int num : nums){
        set.add(num);
       }
       Arrays.sort(nums);
       int low = nums[0];
       int high = nums[n-1];

       for(int i = low;i <= high; i++){
           if(!set.contains(i)){
                list.add(i);
            }
            
       }
       
    return list;
    }
}