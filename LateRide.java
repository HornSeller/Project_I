int solution(int n) {
    int h = n / 60, m = n % 60;
    return h / 10 + h % 10 + m / 10 + m % 10;
}
