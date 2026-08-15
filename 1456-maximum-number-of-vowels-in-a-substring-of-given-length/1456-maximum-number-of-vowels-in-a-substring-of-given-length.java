class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int vowelcount = 0;
        int length = 0;
        int maxvowelcount = 0;
        int n = s.length();
        for(int right = 0; right < n; right++){
            char c = s.charAt(right);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelcount++;
                }
            length++;

            while(right - left + 1 == k){        
                maxvowelcount = Math.max(maxvowelcount,vowelcount);
                char ch = s.charAt(left);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount--;
                }
                left++;
            }
        }
        return maxvowelcount;
    }
}