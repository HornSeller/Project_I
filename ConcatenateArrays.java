int[] solution(int[] a, int[] b) {
    int[] arr = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
        arr[i] = a[i];
    }
    for (int i = a.length; i < arr.length; i++) {
        arr[i] = b[i - a.length];
    }
    return arr;
}
