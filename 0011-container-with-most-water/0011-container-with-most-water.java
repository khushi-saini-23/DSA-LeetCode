class Solution {
    public int maxArea(int[] height) {
        // int maxwater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int w=j-i;
        //         int ht=Math.min(height[i],height[j]);
        //         int curwater=w*ht;
        //         maxwater=Math.max(maxwater,curwater);
        //     }
        // }
        // return maxwater;
        int n=height.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            ans=Math.max(ans,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;

    }
}