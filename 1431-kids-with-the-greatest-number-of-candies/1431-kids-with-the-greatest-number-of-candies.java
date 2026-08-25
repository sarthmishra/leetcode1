class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean>list = new ArrayList<>();
        int currmax = candies[0];
        for(int i = 0; i < n; i++){
            if(candies[i] > currmax){
                currmax = candies[i];
            }
        }

        for(int i = 0; i < n; i++){
            if((candies[i] + extraCandies) >= currmax){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        // boolean[] barr = new boolean[list.size()];
        // for(int i = 0; i < list.size(); i++){
        //     barr[i] = (list.get(i) != null && list.get(i));
        // }
        // return barr;
        return list;
    }
}