class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;
        int m = arr.length;
        if(n != m){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(target[i],map.getOrDefault(target[i],0)+1);
        }
        for(int i = 0; i < m; i++){
            if(!map.containsKey(arr[i])){
                return false;
            }
            int count = map.get(arr[i]);
            if(count > 1){
                map.put(arr[i],count - 1);
            }else{
                map.remove(arr[i]);
            }
        }
        return map.size() == 0 ? true : false;
    }
}