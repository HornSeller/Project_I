boolean solution(int[] a, int[] b) {
    int x = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i])
            x += 1;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    
    return Arrays.equals(a, b) && x <= 2;
}
