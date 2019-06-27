//  Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays as 2D matrices and adds them, returning the result.

public int[][] matrixAdd(int[][] A, int[][] B) {
    if (A.length == 0) 
        return new int[0][0];
    int rows = A.length;
    int cols = A[0].length;
    int[][] C = new int[A.length][A[0].length];
    for (int i = 0 ; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    return C;
}
