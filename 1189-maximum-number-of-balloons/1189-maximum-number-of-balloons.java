class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        //map.put('l',1);
        map.put('o',0);
        //map.put('o',1);
        map.put('n',0);
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);
        int count = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() < count){
                count = entry.getValue();

            }
        }
        return count;
    }
}