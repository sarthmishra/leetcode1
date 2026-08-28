class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<Integer>set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int j = set.size();
        int[] ans = new int[j];
        Iterator<Integer> iterator = set.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            ans[i] = iterator.next();
            iterator.remove();        
            i++;
        }

        if(j >= 3){
            return ans[j-3];
        }else {
            return ans[j-1];
        }
       
    }
}