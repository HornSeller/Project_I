int solution(int[][] matrix) {
    int s = 0;
    for(int i = 0; i < matrix.length-1; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) matrix[i+1][j] = 0;
        }
    }
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            s += matrix[i][j];
        }
    }
    return s;
}
