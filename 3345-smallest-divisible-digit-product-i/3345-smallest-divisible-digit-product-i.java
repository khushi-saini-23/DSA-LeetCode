class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(digitsProduct(n)%t==0){
                return n;
            }
            n++;
        }
    }
    public static int digitsProduct(int n){
        int num=1;
        while(n>0){
            num*=(n%10);
            n/=10;
        }
        return num;
    }
        
}