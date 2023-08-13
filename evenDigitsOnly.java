boolean solution(int n) {
    int x = 0;
    while (n > 0) {
        x = n % 10;
        n = n / 10;
        if (x % 2 == 0) continue;
        else return false;
    }
    return true;
}
