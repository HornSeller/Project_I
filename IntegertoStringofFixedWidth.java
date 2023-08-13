String solution(int number, int width) {
    String str = Integer.toString(number);
    String res = "";
    int j = str.length() - 1;
    for (int i = width - 1; i >= 0; i--) {
        if (j <= -1) res = "0" + res;
        else res = str.toCharArray()[j] + res;
        j--;
    }
    return res;
}
