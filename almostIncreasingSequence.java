boolean solution(int[] sequence) {
    int count = 0;
    for (int i = 1; i < sequence.length; i++) {
        if (sequence[i] <= sequence[i-1]) {
            count++;
            if (count > 1) {
                return false;
            }
            if (i > 1 && sequence[i] <= sequence[i-2]) {
                sequence[i] = sequence[i-1];
            } else {
                sequence[i-1] = sequence[i];
            }
        }
    }
    return true;
}
