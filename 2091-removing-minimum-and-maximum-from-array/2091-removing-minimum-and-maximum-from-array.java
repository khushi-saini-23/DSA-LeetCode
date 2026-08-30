class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minidx=0;
        int maxidx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minidx]){
                minidx=i;
            }else if(nums[i]>nums[maxidx]){
                maxidx=i;
            }
        }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int op1=(left+1)+(n-right);
        int op2=right+1;
        int op3=n-left;
        return Math.min(op1,Math.min(op2,op3));
    }
}