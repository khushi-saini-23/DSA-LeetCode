class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int result=nums[0];
        while(right>=left){
           while(left<right && nums[left]==nums[left+1]) left++;
           while(right>left && nums[right]==nums[right-1]) right--;
            int mid=left+(right-left)/2;
            if(nums[mid]<result){
                result=nums[mid];
            }
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}