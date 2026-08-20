class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}