class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int m = n;
        while(m != 0){
            int digit = m % 10;
            sum += digit;
            m /= 10;
        }
        int k = n;
        while(k != 0){
            int digit1 = k % 10;
            product *= digit1;
            k /= 10;
        }
        int divisor = sum + product;
        if(n % divisor == 0){
            return true;
        }else{
            return false;
        }

    }
}