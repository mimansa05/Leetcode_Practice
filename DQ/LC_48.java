class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int newMa[][] = new int[n][m];

        int i = 0;  
        int j = 0;   
        while (i < n) {
            while (j < m) {
                newMa[j][n - 1 - i] = matrix[i][j];
                j++;
            }
            i++;
            j = 0;
        }

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                matrix[a][b] = newMa[a][b];
            }
        }
    }
}