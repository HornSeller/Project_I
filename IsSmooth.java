boolean solution(int[] arr) {
    if (arr.length == 1) return true;
    if (arr.length == 2) {
        if (arr[0] == arr[1]) return true;
    }
    if (arr[0] != arr[arr.length - 1]) return false;
    for (int i = 1; i < arr.length - 2; i++) {
        for (int j = i + 1; j < arr.length - 1; j++) {
            if (arr[i] + arr[j] == arr[0]) return true;
        }
    }
    return false;
}
