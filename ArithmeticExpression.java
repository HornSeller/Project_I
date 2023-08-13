boolean solution(int a, int b, int c) {
    if (a + b == c || a - b == c || a * b == c || (a / b == c && a % b == 0))
        return true;
    else return false;
}
