class Solution {
    public int reverseDegree(String s) {
        int totaldeg=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int revAlpos=26-(c-'a');
            int index=i+1;
            totaldeg+=revAlpos*index;

        }
        return totaldeg;
    }
}