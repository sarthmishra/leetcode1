class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i  = 0; i < n; i++){
            while(nums[i] > 0){
                int digit = nums[i] % 10;
                st.push(digit);
                nums[i] /= 10;
            }
            while(!st.isEmpty()){
                list.add(st.pop());
            }

        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}