class Solution {
    public int diagonalSum(int[][] mat) {
        int matrixLength = mat.length;
        int sumOfDiagonal = 0;
        int start = 0;
        int finish = matrixLength - 1;
        if (matrixLength == 1) {
            sumOfDiagonal = mat[0][0];
        } else {

            for (int i = 0; i < matrixLength; i++) {
                sumOfDiagonal += (mat[i][start] + mat[i][finish]);
                start++;
                finish--;
            }
            if (matrixLength % 2 != 0)
                sumOfDiagonal -= mat[matrixLength/2][matrixLength/2];
        }    
        return sumOfDiagonal;        
    }
}