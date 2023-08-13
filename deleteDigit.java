int solution(int n) {
    String str = String.valueOf(n);
    int max = 0;
    for (int i = 0; i < str.length(); i++) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(i);
        if (Integer.parseInt(sb.toString()) > max) {
            max = Integer.parseInt(sb.toString());
        }
    }
    return max;
}
