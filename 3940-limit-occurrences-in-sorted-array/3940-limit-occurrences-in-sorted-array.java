class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num  : nums){
            if(map.getOrDefault(num, 0) < k)
                list.add(num);
            map.put(num,map.getOrDefault(num,0)+1);
             
            
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}