char solution(String inputString) {
    char c = 'a';
    for(int i = 0; i < inputString.length(); i++) {
        if (Character.isDigit(inputString.charAt(i))) {
            c = inputString.charAt(i);
            break;
        }
    }
    return c;
}
