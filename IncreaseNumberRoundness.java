boolean solution(int n) {
    int index = 0;
    String x = Integer.toString(n);
    for (int i = 0; i < x.toCharArray().length; i++) {
        if (x.toCharArray()[i] == '0') {
            index = i;   
            break; 
        }
    }
    if (index == x.toCharArray().length - 1) return false;
    if (index == 0) return false;
    for (int i = index + 1; i < x.toCharArray().length; i++) {
        if (x.toCharArray()[i] != '0') return true;
    }
    return false;
}
