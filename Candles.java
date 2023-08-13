int solution(int candlesNumber, int makeNew) {
    int res = candlesNumber;
    int remains = 0;
    while (candlesNumber > 0) {
        res += candlesNumber / makeNew;
        remains += candlesNumber % makeNew;
        candlesNumber = candlesNumber / makeNew;
    }
    while (remains > 0) {
        res += remains / makeNew;
        remains = remains / makeNew;
    }
    return res;
}
