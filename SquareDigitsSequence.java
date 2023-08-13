int solution(int a0) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(a0);
    int count = 1;
    while (true) {
        int x = 0;
        count++;
        while (a0 > 0) {
            x += (a0 % 10) * (a0 % 10);
            a0 /= 10;
        }
        if (arr.contains(x)) return count;
        else {
            arr.add(x);
            a0 = x;
        }
    }
}
