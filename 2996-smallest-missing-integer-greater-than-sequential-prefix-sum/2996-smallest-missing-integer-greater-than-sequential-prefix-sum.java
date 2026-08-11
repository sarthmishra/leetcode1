class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        int sum = nums[0];
        int i = 1;
            while(i < n && nums[i] == nums[i-1] + 1){
                sum += nums[i];
                i++;
            }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = sum;
        while (set.contains(ans)) {
            ans++;
        } 
        
        return ans;
    }
}