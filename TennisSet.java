boolean solution(int score1, int score2) {
    if (score1 == score2) return false;
    int min = Math.min(score1, score2);
    int max = Math.max(score1, score2);
    if (min < 5) {
        if (max == 6) return true;
        else return false;
    } else {
        if (max == 7) return true;
        else return false;
    }
    
}
