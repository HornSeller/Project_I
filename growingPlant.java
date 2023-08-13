int solution(int upSpeed, int downSpeed, int desiredHeight) {
    int day = 0;
    int height = 0;
    while (height < desiredHeight) {
        height += upSpeed;
        day++;
        if (height >= desiredHeight) return day;
        else height -= downSpeed;
    }
    return day;
}
