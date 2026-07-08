class Solution {
    public long sumAndMultiply(int n) {
        long temp = 0;
        long rev = 0;
        int sum = 0;
        
        
        while(n > 0){
            int curr = n % 10;

            if(curr != 0){
                temp = temp * 10 + curr;
                sum += curr;
            }
            n /= 10;
        }
                while(temp > 0){
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                    
                }
        return rev * sum;
    }
}