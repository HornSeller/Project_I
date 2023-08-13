int solution(String s) {
    boolean[] arr = new boolean[26];
    int count = 0;
    for (char c : s.toCharArray()) {
        if (!arr[c - 'a']) {
            count++;
            arr[c - 'a'] = true;
        }
    }
    return count;
}
