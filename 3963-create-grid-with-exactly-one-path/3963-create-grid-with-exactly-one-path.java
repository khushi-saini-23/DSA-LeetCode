class Solution {
    public String[] createGrid(int m, int n) {
        char matrix[][]=new char [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]='#';
            }
        }
        for(int j=0;j<n;j++){
            matrix[0][j]='.';
        }
        for(int i=0;i<m;i++){
            matrix[i][n-1]='.';
        }
        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            ans[i]=new String(matrix[i]);
        }
        return ans;
    }
}