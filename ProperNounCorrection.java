String solution(String noun) {
    String str = noun.toUpperCase();
    String res = str.charAt(0) + str.substring(1).toLowerCase();
    return res;
}
