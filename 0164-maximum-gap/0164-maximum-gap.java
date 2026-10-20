class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length>=2){
        Arrays.sort(nums);
        int maxvalue=0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])>maxvalue){
                maxvalue=nums[i+1]-nums[i];
            }
        }
        return maxvalue;
        }
        return 0;
    }
}