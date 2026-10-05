class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count= 0;
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch) && map.containsKey(Character.toUpperCase(ch))){
                count++;
                map.remove(Character.toUpperCase(ch));
            }
        }
        return count;
    }
}