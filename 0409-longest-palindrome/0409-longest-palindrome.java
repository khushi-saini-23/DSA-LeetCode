class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[128];
        for(char c:s.toCharArray()){
            count[c]++;
        }
        int length=0;
        boolean Odd=false;
        for(int c:count){
            length+=(c/2)*2;
            if(c%2!=0){
                Odd=true;
            }
        }
        if(Odd){
            length+=1;
        }
        return length;
    }
}