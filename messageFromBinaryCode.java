String solution(String code) {
    int count = 0;
    String temp = "", res = "";
    char[] arr = code.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        temp += arr[i];
        count++;
        if (count == 8) {
            res += (char) Integer.parseInt(temp, 2);
            count = 0;
            temp = "";
        }
    }
    return res;
}
