class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
       // Stack<Character>anst = new Stack<>();
        //int digits = {1,2,3,4,5,6,7,8,9,0};
        for(char ch : s.toCharArray()){
            if( Character.isDigit(ch)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }



        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            char c = st.pop();
            //anst.push(c);
            str.append(c);
        }
       
        return str.reverse().toString();
    }
}