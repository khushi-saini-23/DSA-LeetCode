class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }
        // int left=0;
        // int right=nums.length;
        // int resultindex=-1;
        // while(left<=right){
        //     int mid=left+(right-left)/2;
        //     if(nums[mid]==max){
        //         resultindex=max;
        //         break;
        //     }else if(nums[mid]<max){
        //         left=mid+1;
        //     }else{
        //         right=mid-1;
        //     }
        // }
        return maxindex;
    }
}