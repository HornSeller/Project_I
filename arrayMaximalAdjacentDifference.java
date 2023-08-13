int solution(int[] inputArray) {
    int x = Math.abs(inputArray[1] - inputArray[0]);
    for (int i = 1; i < inputArray.length - 1; i++) {
        if (x < Math.abs(inputArray[i + 1] - inputArray[i]))
            x = Math.abs(inputArray[i + 1] - inputArray[i]);
    }
    return x;
}
