class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                boolean rowMin = true;
                boolean colMax = true;

                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        rowMin = false;
                        break;
                    }
                }

                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > matrix[i][j]) {
                        colMax = false;
                        break;
                    }
                }

                if (rowMin && colMax) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}