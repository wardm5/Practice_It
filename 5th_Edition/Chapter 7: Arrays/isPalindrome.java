public boolean isPalindrome(String[] arr) {
    for (int i = 0; i < arr.length/2; i++) {
        if (!arr[i].equals(arr[arr.length - i - 1]))
            return false;
    }
    return true;
}
