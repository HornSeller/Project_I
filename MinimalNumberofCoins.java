int solution(int[] coins, int price) {
    int count = 0;
    int sum = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
        for (int j = 1; ; j++) {
            if (sum + coins[i] > price) break;
            sum += coins[i];
            count++;
        }
        if (sum == price) break;
    }
    return count;
}
