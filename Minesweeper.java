int[][] solution(boolean[][] matrix) {
    int[][] result = new int[matrix.length][matrix[0].length];
    System.out.println(matrix.length + " " + matrix[0].length);
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[0].length; j++) {
            if (i > 0 && j > 0 && matrix[i - 1][j - 1]) result[i][j]++;
            if (j > 0 && matrix[i][j - 1]) result[i][j]++;
            if (j > 0 && i + 1 < matrix.length && matrix[i + 1][j - 1]) result[i][j]++;
            if (i + 1 < matrix.length && matrix[i + 1][j]) result[i][j]++;
            if (i + 1 < matrix.length && j + 1 < matrix[0].length && matrix[i + 1][j + 1]) result[i][j]++;
            if (j + 1 < matrix[0].length && matrix[i][j + 1]) result[i][j]++;
            if (i > 0 && j + 1 < matrix[0].length && matrix[i - 1][j + 1]) result[i][j]++;
            if (i > 0 && matrix[i - 1][j]) result[i][j]++;
        }
    }
    
    return result;
}
