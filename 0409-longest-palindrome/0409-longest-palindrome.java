class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int length = 0;
        boolean hasOdd = false;
        for(int count : map.values()){
            length += (count/2)*2;
            if(count % 2 != 0){
                hasOdd = true;
            }

        }
        if(hasOdd){
            length += 1;
        }
        return length;

    }
}