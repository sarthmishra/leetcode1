class Solution {
    public int countWords(String[] words1, String[] words2) {
        int n = words1.length;
        int m = words2.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < words1.length; i++){
            map.put(words1[i],map.getOrDefault(words1[i],0)+1);
        }
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i = 0; i < words2.length; i++){
            mp.put(words2[i],mp.getOrDefault(words2[i],0)+1);
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(words1[i]) && mp.containsKey(words1[i])){
                if(map.get(words1[i]) == 1 && mp.get(words1[i]) == 1){
                count++;
                }
            }
        } 
        return count;
    }
}