String solution(String inputString) {
    char[] chars = inputString.toCharArray();
    String result = "";
    for (int i = 0; i < chars.length; i++) {
        switch (chars[i]) {
            case 122: {
              chars[i] = 'a';
              break;  
            }
            default: {
                chars[i]++;
                break;
            }
        }
        result += chars[i];
    }
    System.out.println(chars);
    return result;
}
