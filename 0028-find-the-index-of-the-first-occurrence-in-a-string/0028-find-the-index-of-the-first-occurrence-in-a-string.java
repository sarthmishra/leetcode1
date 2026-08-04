class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if(n2 > n1){
            return -1;
        }
        for(int left = 0; left <= n1 - n2; left++){
            int right = 0;
            while(right < n2 && haystack.charAt(left + right) == needle.charAt(right)){
                right++;
            }
            if (right == n2) {
                return left;
            }
        }
        return -1;
        
    }
}