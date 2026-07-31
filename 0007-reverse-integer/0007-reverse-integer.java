class Solution {
    public int reverse(int x) {
        long rn=0;
        while (x != 0) {
            rn=rn*10+x%10;
            x/=10;
        }
        if((int)rn!=rn){
            return 0;
        }
        return (int)rn;
    }
}