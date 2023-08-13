String solution(String note) {
    char[] arr = note.toCharArray();
    String res = "";
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 48 && arr[i] <= 57) {
            res += (char) (97 + arr[i] - 48);
        }
        else if (arr[i] >= 97 && arr[i] <= 106) {
            res += (char) (48 + arr[i] - 97);
        }
        else res += arr[i];
    }
    return res;
}
