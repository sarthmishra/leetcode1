class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int n = s.length();
        // int[] freq = new int[26];
        // for(char c : s.toCharArray()){
        //     freq[c - 'a']++;
        // }
        for(int i = 0; i < n; i++){
            
           char c = s.charAt(i);
           int revAlphabetIndex = 26 - (c - 'a');
           int ind = i+1;
           ans += revAlphabetIndex * ind;
        }
        return ans;
    }
}