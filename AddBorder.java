String[] solution(String[] picture) {
    String[] array = new String[picture.length + 2];
    for(int i = 0; i < picture.length; i++) 
        array[i + 1] = "*" + picture[i] + "*";
    
    array[picture.length + 1] = array[1].replaceAll(".","*");
    array[0] = array[picture.length + 1];
    return array;
}
