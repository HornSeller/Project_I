int[] solution(int[] a) {
    int x = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == -1) continue;
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] == -1) continue;
            else if (a[i] > a[j]) {
                x = a[i];
                a[i] = a[j];
                a[j] = x;
                j--;
            }
        }
    }
    return a;
}
