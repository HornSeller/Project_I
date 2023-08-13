int[] solution(int legs) {
    int count = 0;
    for (int i = 0; i < legs / 2 + 1; i++) {
        if ((legs - 2 * i) % 4 == 0) count++;
    }
    int[] res = new int[count];
    int j = 0;
    for (int i = 0; i < legs / 2 + 1; i++) {
        if ((legs - 2 * i) % 4 == 0) {
            res[j] = i;
            j++;
        }
    }
    return res;
}
