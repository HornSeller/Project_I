boolean solution(String ver1, String ver2) {
    String[] a = ver1.split("\\.");
    String[] b = ver2.split("\\.");
    for (int i = 0; i < a.length; i++) {
        int x = Integer.parseInt(a[i]);
        int y = Integer.parseInt(b[i]);
        if (x == y) continue;
        else return x > y; 
    }
    return false;
}
