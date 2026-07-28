class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halflen = n/2;
        char[] firstHalf = s.substring(0,halflen).toCharArray();
        Arrays.sort(firstHalf);
        String left = new String(firstHalf);
        String right = new StringBuilder(left).reverse().toString();
        String middle  = (n % 2 != 0)? String.valueOf(s.charAt(halflen)) : "";
        return left + middle + right;

    }
}