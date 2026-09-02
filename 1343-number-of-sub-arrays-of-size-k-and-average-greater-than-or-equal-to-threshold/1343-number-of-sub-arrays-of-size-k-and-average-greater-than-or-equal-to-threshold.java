class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
             sum=sum+arr[i];
        }
        if(sum/k>=th){
            count++;
        }
        for(int i=1;i<=arr.length-k;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            if(sum/k>=th){
                count++;
            }
        }
        return count;
    }
}