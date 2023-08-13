int solution(int[] inputArray) {
    int incrStep = 0;
    for (int i = 0; i < (inputArray.length - 1); i++) {
        if (inputArray[i + 1] <= inputArray[i]) {
            int numStep = inputArray[i] - inputArray[i + 1] + 1;
            inputArray[i + 1] = inputArray[i + 1] + numStep;
            incrStep+=numStep;
        }
    }
    return incrStep;
}