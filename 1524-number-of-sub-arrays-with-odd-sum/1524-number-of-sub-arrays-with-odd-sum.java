class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddcount=0;
        long evencount=1;
        long currentsum=0;
        long totalsubarr=0;
        int mod=1000000007;
        for(int num:arr){
            currentsum+=num;
            if(currentsum % 2!=0){
                totalsubarr=(totalsubarr+evencount)%mod;
                oddcount++;
            }else{
                totalsubarr=(totalsubarr+oddcount)%mod;
                evencount++;
            }
        }
        return(int) totalsubarr;
    }
}