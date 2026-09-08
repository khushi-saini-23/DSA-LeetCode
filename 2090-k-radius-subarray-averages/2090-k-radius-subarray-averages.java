class Solution {
    public int[] getAverages(int[] nums, int k) {
        int length=nums.length;
        int result[]=new int[length];
        
        int w=2*k+1;
        if(w>length){
            for(int i=0;i<length;i++){
            result[i]=-1;
            }
            return result;
        }
        for(int i=0;i<k;i++){
            result[i]=-1;
        }
        long sum=0;
        for(int i=0;i<w;i++){
            sum=sum+nums[i];
        }
        result[k]=(int)(sum/w);
        for(int i=1;i<=length-w;i++){
            sum=sum-nums[i-1]+nums[i+w-1];
            result[k+i]=(int)(sum/w);
        }
        for(int i=length-k;i<length;i++){
            result[i]=-1;
        }
        return result;
    }
}