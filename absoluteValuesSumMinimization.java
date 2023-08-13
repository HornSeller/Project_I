int solution(int[] a) {
    int[] x = new int[a.length];
    for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < x.length; j++) {
            x[i] += Math.abs(a[j] - a[i]);
        }
    }
    int min = x[0];
    int res = 0;
    for (int i = 0; i < x.length; i++) {
        if (min > x[i]) {
            min = x[i];
            res = i;
        }
    }
    return a[res];
}
