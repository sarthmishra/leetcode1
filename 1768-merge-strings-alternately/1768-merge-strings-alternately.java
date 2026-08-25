class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int n = n1 + n2;
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        char[] arr = new char[n];
        int i = 0, j = 0, k = 0;
        while( i < n1 || j < n2){
            if(i  < n1){
                arr[k++] = c1[i++]; 
            }
            if(j  < n2){
                arr[k++] = c2[j++];
            }
            
        }
    return new String(arr);
    }
}