class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n <= 0){
        return false;
        }
    int k =  n & (n-1);   
    return k == 0 ? true : false;
    }
}