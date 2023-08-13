int solution(int n) {
    int sum = 0, count = 0;
    
    if (n < 10) return 0;
    
    while (true) {
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum >= 10) {
            count++;
            n = sum;
            sum = 0;
        }
        else {
            count++;
            return count;
        }
    }
}
