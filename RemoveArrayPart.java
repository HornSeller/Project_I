int[] solution(int[] inputArray, int l, int r) {
    int j = -1;
    int[] arr = new int[inputArray.length - (r - l) - 1];
    for (int i = 0; i < inputArray.length; i++) {
        if (i >= l && i <= r) continue;
        j++;
        arr[j] = inputArray[i];
    }
    return arr;
}
