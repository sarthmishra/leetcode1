class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int count1 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int count2 = 0;
        for(int i = 0; i < n/2; i++){
            if(num.charAt(i) == '?'){
                count1++;
            }else{
                sum1 += num.charAt(i) - '0';
            }
        }
        for(int j = n/2; j < n; j++){
            if(num.charAt(j) == '?'){
                count2++;
            }else{
                sum2 += num.charAt(j) - '0';
            }
        }
        int count = count1 + count2;
        if(count % 2 != 0){
            return true;
        }
            if (sum1 > sum2 && count1 >= count2) return true;
            if (sum2 > sum1 && count2 >= count1) return true;

            if((sum1 - sum2 ) * 2 == 9 * (count2 - count1)){
                return false;
            }else{
                return true;
            }
        
    }
}