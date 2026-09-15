class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int len = 0;
        int R = 0;
        int L = 0;
        int H = 0;
        for(int i = 0; i < n; i++){
            if(moves.charAt(i) == 'R'){
                R++;
            }else if(moves.charAt(i) == 'L'){
                L++;
            }else{
                H++;
            }
        }
        // int c = Math.max(R,L);
        // int j = Math.max(R,L);

        return H + Math.abs(R-L);
    }
}