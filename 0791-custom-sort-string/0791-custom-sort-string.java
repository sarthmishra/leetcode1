class Solution {
    public String customSortString(String order, String s) {
        int n = order.length();
        int m = s.length();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i < m; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char c = order.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                for(int j = 0; j < count; j++){
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            char ch = entry.getKey();
            for(int i = 0; i < count; i++){
                sb.append(ch);
            }
        }
        
    return sb.toString();
    }
}