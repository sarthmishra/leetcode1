class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        for(String s : strs){
            char[] charArray =  s.toCharArray();
            Arrays.sort(charArray);

            String SortedKey = new String(charArray);

            if(!map.containsKey(SortedKey)){
                map.put(SortedKey,new ArrayList<>());
            }
            map.get(SortedKey).add(s);
        }
        return new ArrayList<>(map.values());

    }
}