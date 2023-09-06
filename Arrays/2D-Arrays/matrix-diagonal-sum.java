class Solution {
    public int diagonalSum(int[][] mat) {
        int row_start = 0, col_start = 0;
        int row_end = mat.length-1,col_end=mat.length-1;
        int j=0;
        int sum = 0;
        for(int i=row_start;i<=row_end;i++){
            sum += mat[i][j];
            mat[i][j]=0;
            j=j+1;
        }
        j=mat.length-1;
        for(int i=row_start;i<=row_end;i++){
            sum += mat[i][j];
            mat[i][j]=0;
            j=j-1;
        }
        return sum;
    }
}
