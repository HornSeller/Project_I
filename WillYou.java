boolean solution(boolean young, boolean beautiful, boolean loved) {
    if (young == true && beautiful == true) {
        if (loved == true) return false;
        else return true;
    }
    else if (young == false || beautiful == false) {
        if (loved == true) return true;
        else return false;
    }
    else return false;
}
