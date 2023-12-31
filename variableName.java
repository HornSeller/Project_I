boolean solution(String name) {
    if(Character.isDigit(name.charAt(0))) return false;
    for (int i = 0; i < name.length(); i++) {
        if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != '_') return false;
    }
    return true;
}
