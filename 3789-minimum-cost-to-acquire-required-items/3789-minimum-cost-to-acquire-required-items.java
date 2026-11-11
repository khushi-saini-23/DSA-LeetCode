class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(cost1+cost2<=costBoth){
            return need1*(long)cost1+need2*(long)cost2;
        }
        long both=Math.min(need1,need2);
        long total=both*costBoth;
        need1-=both;
        need2-=both;
        if(need1>0){
            total+=need1*Math.min((long)cost1,(long)costBoth);
        }else if(need2>0){
            total+=need2*Math.min((long)cost2,(long)costBoth);

        }
        return total;
        
    }
}