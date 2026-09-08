class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            //char k = Character.toLowerCase(c);
            if(!st.isEmpty() && Math.abs(st.peek() - c) == 32){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
        return sb.reverse().toString();
    }
}