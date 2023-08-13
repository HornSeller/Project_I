int solution(int deposit, int rate, int threshold) {
    int count = 0;
    double r = rate;
    double x = r / 100;
    double d = deposit;
    while (d < threshold) {
        d += d * x;
        count++;
    }
    return count;
}
