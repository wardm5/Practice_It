public boolean isPalindrome(String[] arr) {
    int length = arr.length;
    for (int i = 0 ; i < length / 2; i++) {
        if (!arr[i].equals(arr[length - 1 - i])) {
            return false;
        }
    }
    return true;
}
