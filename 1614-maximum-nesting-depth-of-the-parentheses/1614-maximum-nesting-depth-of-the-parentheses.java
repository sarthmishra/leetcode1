class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int max = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                count++;
            max = Math.max(max,count);
            }else if(ch == ')'){
                count--;
            }
        }
        return max;
    }
}