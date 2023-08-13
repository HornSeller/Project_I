int solution(int n) {
    int count = 0;
    for (int i = 1; i < n; i++) {
        int x = i;
        for (int j = i + 1; j < n; j++) {
            x += j;
            if (x == n) {
                count++;
                break;
            }
            if (x > n) {
                break;
            }
        }
    }
    return count;
}
