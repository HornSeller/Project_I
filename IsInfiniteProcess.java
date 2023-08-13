boolean solution(int a, int b) {
    if (a == b) return false;
    else if (a > b) return true;
    else if ((b - a) % 2 == 0) return false;
    else return true;
}
