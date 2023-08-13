boolean solution(int n) {
    String s = String.valueOf(n);
    int x = 0, y = 0;
    for (int i = 0; i < s.length() / 2; i++) {
        x += Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    for (int i = s.length() / 2; i < s.length(); i++) {
        y += Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    if (x == y) return true;
    else return false;
}
