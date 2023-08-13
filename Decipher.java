String solution(String cipher) {
    String res = "";
    String temp = "";
    char[] arr = cipher.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        temp += arr[i];
        if (Integer.parseInt(temp) >= 97 && Integer.parseInt(temp) <= 122) {
            res += (char) Integer.parseInt(temp);
            temp = "";
        }
        else continue;
    }
    return res;
}
