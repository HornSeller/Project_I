boolean solution(String inputString) {
    StringBuilder sb = new StringBuilder(inputString);
    return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());
}
