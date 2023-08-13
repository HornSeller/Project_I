boolean solution(int n) {
    if (n == 1) return true;
    for (int i = 2; i * i <= n; i++) {
        int pow = i * i;
        if (pow == n) return true;
        while (pow < n) {
            pow *= i;
            if (pow == n) return true;
        }
    }
    return false;
}
