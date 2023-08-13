String solution(String startTag) {
    int index = 0;
    for (int i = 0; i < startTag.length(); i++) {
        if (startTag.charAt(i) == ' ' || startTag.charAt(i) == '>') {
            index = i;
            break;
        }
    }
    return "</" + startTag.substring(1, index) + ">";
}
