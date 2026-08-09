class Solution {
    public boolean isHappy(int n) {
        int ori=n;
        while(n!=1 && n!=4){
            int sum=0;
            while(ori>0){
                int d=ori%10;
                sum=sum+(d*d);
                ori=ori/10;
            }
            n=sum;
            ori=n;
        }
        return n==1;
        
    }
}