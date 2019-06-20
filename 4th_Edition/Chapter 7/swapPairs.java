public void swapPairs(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (i + 1 >= arr.length)
            break;
        String temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        i++;
    }    
}
