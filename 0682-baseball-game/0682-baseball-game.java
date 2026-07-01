class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack <Integer> st = new Stack<>();
        String ops = "CD+";

        for(String o : operations){
            if( ops.indexOf(o) != -1){
                
                int res = 0;
                if(o.equals("+")){
                    int d1 = st.pop();
                    int d2 = st.pop();
                    res = d1 + d2;
                    st.push(d2);
                    st.push(d1);
                    st.push(res);
                }
                else if(o.equals("D")){
                    st.push(2*st.peek());
                }
                else if(o.equals("C")){
                    st.pop();
                }
                
            }else{
                st.push(Integer.parseInt(o));

                }
            }
            int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}