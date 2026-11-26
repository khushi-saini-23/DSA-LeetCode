class Solution {
    public boolean canAliceWin(int n) {
        int move=10;
        boolean alice=true;
        while(n>=move){
            n-=move;
            move--;
            alice=!alice;
        }
        return !alice;
    }
}