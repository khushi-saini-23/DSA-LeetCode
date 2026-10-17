class Solution {
    public int countDigitOne(int n) {
         if(n<=0){
            return 0;
        }
        int count=0;
        int i=1;
        while(i<=n){
            long h=n/(i*10);
            long c=(n/i)%10;
            long l=n%i;
            if(c==0){
                count+=h*i;
            }else if(c==1){
                count+=(h*i)+(l+1);
            }else{
                count+=(h+1)*i;
            }
            i*=10;
        }
        return count;
    }
}