int solution(int k) {
    int yellowCount = 0, redCount = 0;
    for (int i = 1; i <= k; i++) {
        if (i % 2 == 1) yellowCount += i * i;
        else redCount += i * i;
    }
    return redCount - yellowCount;
}
