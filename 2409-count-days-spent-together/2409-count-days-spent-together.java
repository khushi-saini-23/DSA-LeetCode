class Solution {
    public int countDaysTogether(String aAlice, String lAlice, String aBob, String lBob) {
        int [] dm={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aA=convertDays(aAlice,dm);
        int aL=convertDays(lAlice,dm);
        int bA=convertDays(aBob,dm);
        int bL=convertDays(lBob,dm);
        int start=Math.max(aA,bA);
        int end=Math.min(aL,bL);
        return Math.max(0,end-start+1);

    }
    public static int convertDays(String date,int[]dm){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int totaldays=day;
        for(int i=0;i<month-1;i++){
            totaldays+=dm[i];
        }
        return totaldays;
    }
}