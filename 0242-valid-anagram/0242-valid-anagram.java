class Solution {
    public boolean isAnagram(String s, String t) {
        int k = s.length();
        int l = t.length();
        if(k != l){
            return false;
        }
        HashMap<Character,Integer>map = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            if(!map.containsKey(c))
            return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return true;
    }
}