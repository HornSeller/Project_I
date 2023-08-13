String[] solution(String[] inputArray) {
    int max = 0, count = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() > max) {
            max = inputArray[i].length();
            count = 1;
        }
        if (inputArray[i].length() == max) count++;
    }
    String[] res = new String[count - 1];
    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() == max) {
            res[j] = inputArray[i];
            j++;
        }
    }
    return res;
}
