int solution(int maxLength, String text) {
    int count = 0, res = 0;
    for (int i = 0; i < text.length(); i++) {
        if (Character.isLetter(text.toCharArray()[i])) {
            count++;
            if (i == text.length() - 1 && count <= maxLength) res++;
        }
        else {
            if (count <= maxLength && count != 0) res++;
            count = 0;
        }
    }
    return res;
}
