int[] solution(int[] a) {
    int[] b = new int[2];
    for (int i = 0; i < a.length; i += 2) {
        b[0] += a[i];
    }
    for (int i = 1; i < a.length; i += 2) {
        b[1] += a[i];
    } 
    return b;
}
