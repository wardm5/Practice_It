public int countStrings(String[] arr, String s) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (s.equals(arr[i]))
            count++;
    }
    return count;
}
