String solution(String text) {
    char[] arr = text.toCharArray();
    String temp = "", res = "";
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if (Character.isLetter(arr[i])) {
            temp += arr[i];
            if (i == arr.length - 1) {
                if (max < temp.length()) {
                    res = temp;
                    max = temp.length();
                }
            }
            continue;
        }
        else {
            if (max < temp.length()) {
                res = temp;
                max = temp.length();
            }
            temp = "";
        }
    }
    return res;
}
