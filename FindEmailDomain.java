String solution(String address) {
    String res = "";
    int index = 0;
    for (int i = address.toCharArray().length - 1; i >= 0; i--) {
        if (address.toCharArray()[i] == '@') {
            index = i;
            break;
        }
    }
    
    res = address.substring(index + 1, address.length());
    return res;
}
