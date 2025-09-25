class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row has a zero
        for (int col = 0; col < n; col++) {
            if (matrix[0][col] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has a zero
        for (int row = 0; row < m; row++) {
            if (matrix[row][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and col as markers
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Handle first row
        if (firstRowZero) {
            for (int col = 0; col < n; col++) {
                matrix[0][col] = 0;
            }
        }

        // Handle first column
        if (firstColZero) {
            for (int row = 0; row < m; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
