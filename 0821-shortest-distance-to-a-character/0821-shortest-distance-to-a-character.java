class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        char[] ch = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
                list.add(i);
            }
        }
        int[] arr = list.stream()
                        .mapToInt(Integer::intValue) 
                        .toArray();       
        for(int i = 0; i < n; i++){
            int minDist = Integer.MAX_VALUE;
            for(int j = 0; j < arr.length; j++){
                int dist = Math.abs(arr[j] - i);
                minDist = Math.min(minDist,dist);
            }
            ans[i] = minDist;
        }
        return ans;
    }
}