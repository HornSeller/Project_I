String solution(String inputString) {
    String res = "";
    char[] arr = inputString.toCharArray();
    for (int i = 0; i < inputString.length(); i++) {
        if (arr[i] <= 109) res += (char) (110 + (109 - arr[i]));
        else res += (char) (109 - (arr[i] - 110));
    }
    return res;
}
