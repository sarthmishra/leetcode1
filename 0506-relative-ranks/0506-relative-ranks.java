class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] str = new String[n];
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n; i++){
            if(score[i] > max){
                Smax = max;
                max = score[i];
            }else if( Smax < score[i] && score[i] != max){
                Smax = score[i];
            }
        }
        int Tmax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(score[i] > Tmax && score[i] != max && score[i] != Smax){
                Tmax = score[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(score[i] == max){
                str[i] = "Gold Medal";
            }else if(score[i] == Smax){
                str[i] = "Silver Medal";
            }else if(score[i] == Tmax){
                str[i] = "Bronze Medal";
            }else{
               int higherCount = 0;
               for(int j = 0; j < n; j++){
                if(score[j] > score[i]){
                    higherCount++;
                    }
                }
               str[i] = String.valueOf(higherCount + 1);
            }
        }
        return str; 
        
    }
}