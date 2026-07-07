class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
                if(c == '#'){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }else{
                    st.push(c);
                }
        }
        while(!st.isEmpty()){
            char ch = st.pop();
            str.append(ch);
        }
        str.reverse();
        Stack<Character>sta = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : t.toCharArray()){
            if(c == '#'){
                    if(!sta.isEmpty()){
                        sta.pop();
                    }
                }else{
                    sta.push(c);
                }
        }
        while(!sta.isEmpty()){
            char ch = sta.pop();
            sb.append(ch);
        }
        sb.reverse();
        return str.toString().equals(sb.toString());

            
        
    }
}