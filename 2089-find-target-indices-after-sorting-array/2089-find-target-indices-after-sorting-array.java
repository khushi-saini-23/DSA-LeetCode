class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        int left=0;
        int right=nums.length-1;
        int FirstIndex=-1;
        while(right>=left){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                FirstIndex=mid;
                right=mid-1;

            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(FirstIndex==-1){
            return result;
        }
        for(int i=FirstIndex;i<nums.length && nums[i]==target;i++){
            result.add(i);
        }
        return result;
    }
}