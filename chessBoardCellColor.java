boolean solution(String cell1, String cell2) {
    if ((Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == 0 && Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2 == 0) || (Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 != 0 && Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2 != 0)) return true;
    else return false;
}
