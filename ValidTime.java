boolean solution(String time) {
    String[] arr = time.split("\\:");
    return Integer.parseInt(arr[0]) <= 23 && Integer.parseInt(arr[0]) >= 0 && Integer.parseInt(arr[1]) <= 59 && Integer.parseInt(arr[1]) >= 0;
}
