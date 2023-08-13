int[] solution(int lastNumberOfDays) {
    if (lastNumberOfDays == 30) 
        return new int[]{31};
    if (lastNumberOfDays == 29 || lastNumberOfDays == 28)
        return new int[]{31};
    return new int[]{28, 30, 31};
    
}
