int solution(int param1, int param2) {
    int x = 0;
    String res = "";
    if (param1 == 0 && param2 == 0) return 0;
    while (param1 > 0 || param2 > 0) {
        if (param1 % 10 + param2 % 10 == 10) x = 0;
        else if (param1 % 10 + param2 % 10 > 10) x = (param1 % 10 + param2 % 10) % 10;
        else x = param1 % 10 + param2 % 10;
        param1 /= 10;
        param2 /= 10;
        res = x + res;
    }
    return Integer.parseInt(res);
}
