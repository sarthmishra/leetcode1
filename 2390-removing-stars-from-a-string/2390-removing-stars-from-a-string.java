class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '*'){
                st.pop();
            }else{
                st.push(ch[i]);
            }
        }
        ArrayList <Character> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.reverse().toString();
    }
}