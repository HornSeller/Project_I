int solution(int divisor, int bound) {
    int n = 0;
    for(int i = bound; i > 0; i--) {
        if (i % divisor == 0) {
            n = i;
            break;
        }
    }
    return n;
}
