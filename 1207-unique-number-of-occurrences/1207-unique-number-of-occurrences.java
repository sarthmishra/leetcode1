class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer>map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer>set = new HashSet<>();
        for(int num : map.values()){
            if(set.contains(num)){
                return false;
            }else{
                set.add(num);
            }
        }
        return true;
    }
}