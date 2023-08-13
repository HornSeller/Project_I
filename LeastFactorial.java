int solution(int n) {
    int res = 1;
    for (int i = 1; i < n; i++) {
        res *= i;
        if (res >= n) break;
    }
    return res;
}
