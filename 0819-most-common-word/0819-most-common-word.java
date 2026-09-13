class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] s = paragraph.toLowerCase().split("[!?',;.\\s]+");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length; i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }
        for(int i = 0; i < banned.length; i++){
            map.remove(banned[i]);
        }
        String ans = "";
        int maxCount = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}