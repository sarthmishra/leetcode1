class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if( n != m){
            return false;
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i = 0; i < m; i++){
            map1.put(word2.charAt(i),map1.getOrDefault(word2.charAt(i),0)+1);
        }
        ArrayList<Integer> freq1 = new ArrayList<>(map.values());
        ArrayList<Integer> freq2 = new ArrayList<>(map1.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        for(int i = 0; i < m; i++){
          if(!map.containsKey(word2.charAt(i))){
              return false;
            }
         }
        for(int i = 0; i < n; i++){
          if(!map1.containsKey(word1.charAt(i))){
              return false;
            }
         }

        return freq1.equals(freq2);
    }
}





