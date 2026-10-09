class Solution {
    public int maxSubArray(int[] nums) {
      int left=0;
      int right=0;
      int max=nums[0];
      int sum=0;
      while(right<nums.length){
        sum+=nums[right];
        max=Math.max(max,sum);
        if(sum<0){
            sum=0;
            left=right+1;
        }
        right++;
      }
      return max;  
    }
}