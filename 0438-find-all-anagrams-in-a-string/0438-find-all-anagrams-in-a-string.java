class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Character,Integer>map = new HashMap<>();
        //Anagrams
        int m = p.length();
        for(char c : p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = map.size();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char rc = s.charAt(right);
            if(map.containsKey(rc)){
                map.put(rc,map.get(rc) -1);
                if(map.get(rc) == 0){
                    count--;
                }
            }
            if (right - left + 1 == m) {
                if (count == 0) {
                    list.add(left);
                }
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) == 1) {
                        count++;

                        }
                }
                left++;

                }
        }
        
        return list;
        

    }
}