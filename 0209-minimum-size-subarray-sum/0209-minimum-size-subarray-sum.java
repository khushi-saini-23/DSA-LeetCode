class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int r=0;
        int l=0;
        int minlength=Integer.MAX_VALUE;
        int n=nums.length;
        while(r<n){
            sum=sum+nums[r];
            while(sum>=target){
                minlength=Math.min(minlength,r-l+1);
                sum=sum-nums[l];
                l=l+1;
            }
            
            r=r+1;
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}