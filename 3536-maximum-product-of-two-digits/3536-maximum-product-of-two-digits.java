class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        while(n > 0){
            int k = n % 10;
            list.add(k);
            n = n / 10;
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        int m = arr.length;
        int prod = 1;
        int maxprod = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            for(int j = i+1; j <m; j++){
                prod = arr[i]*arr[j];
                maxprod = Math.max(maxprod,prod);
            }
            
        }
        return maxprod;
    }
}