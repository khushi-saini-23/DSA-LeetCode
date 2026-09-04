class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int count=0;
        int maxlength=0;
        int []freq=new int[100001];
        int n=fruits.length;
        while(r<n){
            if(freq[fruits[r]]==0){
                count++;
            }
            freq[fruits[r]]++;
            while(count>2){
                freq[fruits[l]]--;
                if(freq[fruits[l]]==0){
                    count--;
                }
                l=l+1;
            }
                maxlength=Math.max(maxlength,r-l+1);
            r=r+1;
        }
        return maxlength;
    }
}