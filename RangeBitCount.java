int solution(int a, int b) {
    int result = 0;
    for (int i = a; i <= b; i++)
        result += Integer.bitCount(i);
    
    return result;
}
