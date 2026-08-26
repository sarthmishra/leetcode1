class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int left = 0;
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int right = 0;
        String result = "";
        while( right < n){
            if(s.charAt(right) - '0' == 1){
                count++;
            }
            while(count == k){
                String currentStr = s.substring(left, right + 1);
                if (currentStr.length() < minlen) {
                    minlen = currentStr.length();
                    result = currentStr;
                }
                else if (currentStr.length() == minlen) {
                    if (currentStr.compareTo(result) < 0) {
                        result = currentStr;
                    }
                }
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
            right++;
        }
        return result;
    }
}