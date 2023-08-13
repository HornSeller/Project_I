int solution(int[] inputArray, int k) {
    int[] arr = new int[inputArray.length - k + 1];
    for (int i = 0; i < inputArray.length - k + 1; i++) {
        for (int j = i; j <= i + k - 1; j++) {
            arr[i] += inputArray[j];
        }
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (max < arr[i]) max = arr[i];
    }
    return max;
}
