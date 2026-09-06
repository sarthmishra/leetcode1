class Solution {
    public int beautySum(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        // for(char c : ch){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
         int count = 0;
        // int maxFreq = 0;
        // int minFreq = 0;
        // for(int i = 1; i < ch.length ; i++){
        //     if(ch[i] != ch[i-1]){

        //     }
        //     else{
        //         maxFreq++;
        //     }
        // }
        //int maxFreq = 0;
        //int minFreq = 0;
        
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
            
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;
            for(int k = 0;k < 26; k++){
                if(freq[k] > 0){
                    maxFreq = Math.max(maxFreq,freq[k]);
                minFreq = Math.min(minFreq,freq[k]);
                }
            }
            count += (maxFreq - minFreq);
            }
        }
        return count;
    }
}