class Solution {
    public int findKthNumber(int m, int n, int k) {
        int left=0;
        int right=m*n;
        int ans=right;
        while(right>=left){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=1;i<=m;i++){
                count+=Math.min(mid/i,n);
            
            } if(count<k){
                left=mid+1;
            }else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}