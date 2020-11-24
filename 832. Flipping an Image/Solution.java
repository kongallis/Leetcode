class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] newA = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                newA[i][j] = A[i][A[i].length - j - 1];
                if (newA[i][j] == 1)
                    newA[i][j] = 0;
                else if (newA[i][j] == 0)
                    newA[i][j] = 1;
            }
        }
        return newA;
    }
}