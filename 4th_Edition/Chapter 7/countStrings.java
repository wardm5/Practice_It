public int countStrings(String[] arr, String a) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(a)) {
            count++;
        }
    }
    return count;
}
