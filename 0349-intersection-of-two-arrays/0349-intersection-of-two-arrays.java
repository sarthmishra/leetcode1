class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;


        Map<Integer,Integer>map = new HashMap<>();
        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer>set = new HashSet<>();
        for(int num : nums2){
            if(map.containsKey(num)){
                set.add(num);
            }
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for(int val : set){
            ans[i++] = val;
        }
        return ans;
        
    }
}