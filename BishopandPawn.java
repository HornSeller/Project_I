boolean solution(String bishop, String pawn) {
    char x1 = bishop.charAt(0), y1 = bishop.charAt(1);
    char x2 = pawn.charAt(0), y2 = pawn.charAt(1);
    if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) return true;
    else return false;
}
