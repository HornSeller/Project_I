boolean solution(String inputString) {
    if (inputString.length() % 2 == 1) return false;
    String str1 = inputString.substring(0, inputString.length() / 2);
    String str2 = inputString.substring(inputString.length() / 2, inputString.length());
    
    return str1.equals(str2);
}
