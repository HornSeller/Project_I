int[] solution(int[][] matrix, int column) {
   int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] = matrix[i][column];
    }
    return result;
}