class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<List<Integer>> answer = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i = 0; i < n1; i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for(int i = 0; i < n2; i++){
            if(!map.containsKey(nums2[i]) && !list.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        

        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i < n2; i++){
            set.add(nums2[i]);
        }


        for(int i = 0; i < n1; i++){
            if(!set.contains(nums1[i]) && !list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
       answer.add(list1);
       answer.add(list);
       return answer;


    }
}