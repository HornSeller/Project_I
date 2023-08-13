boolean solution(String inputString) {
    StringBuffer str = new StringBuffer(inputString);
    if(inputString.equals(str.reverse().toString()))
        return true;
    else return false;
}
