class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        ArrayList<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < str1.length; i++){
            map.put(str1[i],map.getOrDefault(str1[i],0)+1);
            index++;
        }
        for(int i = 0; i < str2.length; i++){
            map.put(str2[i],map.getOrDefault(str2[i],0)+1);
        }
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        int n = list.size();
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}