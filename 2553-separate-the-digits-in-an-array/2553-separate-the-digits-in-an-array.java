class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = String.valueOf(nums[i]);
            for(int j = 0; j < s.length(); j++){
                int k = s.charAt(j) - '0';
                list.add(k);
            }

        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}