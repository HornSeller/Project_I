int solution(int[] inputArray) {
    for (int n = 1; ; n++) {
        if (n % 2 == 1) {
            if (inputArray.length == 1) return inputArray[0];
            int[] arr = new int[inputArray.length / 2];
            for (int i = 0; i < inputArray.length - 1; i += 2) {
                arr[i / 2] = inputArray[i] + inputArray[i + 1];
            }
            inputArray = arr;
        }
        if (n % 2 == 0) {
            if (inputArray.length == 1) return inputArray[0];
            int[] arr = new int[inputArray.length / 2];
            for (int i = 0; i < inputArray.length - 1; i += 2) {
                arr[i / 2] = inputArray[i] * inputArray[i + 1];
            }
            inputArray = arr;
        }
    }
}
