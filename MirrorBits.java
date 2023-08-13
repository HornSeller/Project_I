int solution(int a) {
    String x = Integer.toBinaryString(a);
    StringBuilder str = new StringBuilder(x);
    int result = Integer.parseInt(str.reverse().toString(), 2);
    return result;
}
