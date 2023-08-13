int solution(String inputString) {
    int res = 0;
    String temp = "0";
    char[] arr = inputString.toCharArray();
    for(int i = 0; i < arr.length; i++) {
        if(Character.isDigit(arr[i])) {
            temp += arr[i];
            if (i == arr.length - 1) {
                res += Integer.parseInt(temp);
            }
            continue;
        }
        else {
            res += Integer.parseInt(temp);
            temp = "0";
        }
    }
    return res;
}
