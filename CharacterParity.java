String solution(char symbol) {
    int x = Character.getNumericValue(symbol);
    if (!Character.isDigit(symbol)) return "not a digit";
    else {
        if (x % 2 == 0) return "even";
        else return "odd"; 
    }
}
