int solution(int l, int r) {
    int count = 0;
    for (int i = l; i < r; i++) {
        for (int j = i + 1; j <= r; j++) {
            int a = digitSum(i);
            int b = digitSum(j);
            if (i >= j - b && j <= i + a) count++;
        }
    }
    return count;
}

int digitSum(int num) {
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
