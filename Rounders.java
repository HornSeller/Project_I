int solution(int n) {
    int t = 1;
    while (n >= 10) {
        t *= 10;
        int r = 0;
        if (n % 10 >= 5)
            r = 1;
        n /= 10;
        n += r;
    }
    return t * n;
}
