int[] solution(int[] inputArray, int k) {
    int count = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if ((i + 1) % k == 0) count++;
    }
    int[] arr = new int[inputArray.length - count];
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = x; j < inputArray.length; j++) {
            if ((j + 1) % k == 0) {
                x++;
                continue;
            }
            else {
                arr[i] = inputArray[j];
                x++;
                break;
            }
        }
    }
    return arr;
}
