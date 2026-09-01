class Solution {
    public int[] replaceElements(int[] nums) {
       int max=-1;
       for(int i=nums.length-1;i>=0;i--){
        if(nums[i]>max){
           int temp=max;
           max=nums[i];
           nums[i]=temp;
        }else{
            nums[i]=max;
        }
       }
       return nums;
    }
}