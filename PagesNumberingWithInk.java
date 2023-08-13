int solution(int current, int numberOfDigits) {
    int x = current;
    while (numberOfDigits >= 0) {
        int digitCount = getDigitCount(x);
        if (digitCount > numberOfDigits) return x - 1;
        if (digitCount == numberOfDigits) return x;
        numberOfDigits = numberOfDigits - digitCount;
        x++;
    }
    return x - 1;
}

int getDigitCount(int num) {
    int count = 0;
    while (num > 0) {
        count++;
        num /= 10;
    }
    return count;
}
