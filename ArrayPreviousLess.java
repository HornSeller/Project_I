int[] solution(int[] items) {
    int[] arr = new int[items.length];
    arr[0] = -1;
    for (int i = 1; i < items.length; i++) {
        for (int j = i - 1; j >= 0; j--) {
            if (items[j] < items[i]) {
                arr[i] = items[j];
                break;
            }
            else {
                if (j == 0) arr[i] = -1;
            }
        }
    }
    return arr;
}
