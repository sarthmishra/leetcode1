class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = 0;
        int n = str.length;
        while(right < n){
            if(str[right] == ' '){
                reverse(str,left,right-1);
                left = right + 1;
            }
            right++;
        }
        reverse(str,left,right-1);
        return new String(str);


    }
    private void reverse(char[] str, int left, int right){
            while(left <= right){
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
                
            }
        }
}