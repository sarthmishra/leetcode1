class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            while(num > 0){
                set.add(num);
                num /= 10;
            }
        }
        int len = 0;
        int maxLen = 0;
        for(int num : arr2){
            while(num > 0){
                if(set.contains(num)){
                maxLen = Math.max(maxLen,String.valueOf(num).length());
            }
            num /= 10;
            }
        }
        return maxLen;
    }
}