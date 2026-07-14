class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[] s1freq = new int[26];
        int[] winFreq = new int[26];

        for(char ch : s1.toCharArray()){
            s1freq[ch - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            winFreq[s2.charAt(right) - 'a']++;
         
        if(right - left + 1 > s1.length()){
            winFreq[s2.charAt(left) - 'a']--;
            left++;
            }
        
        if (Arrays.equals(s1freq, winFreq)) {
            return true;
            }
        }
       return false;
    }
}