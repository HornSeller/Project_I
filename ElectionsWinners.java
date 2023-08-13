int solution(int[] votes, int k) {
    int res = 0;
    for (int i = 0; i < votes.length; i++) {
        int x = votes[i] + k;
        int count = 0;
        for (int j = 0; j < votes.length; j++) {
            if (j == i) continue;
            if (x <= votes[j]) break;
            count++;
            if (count == votes.length - 1) res++;
        }
    }
    return res;
}
