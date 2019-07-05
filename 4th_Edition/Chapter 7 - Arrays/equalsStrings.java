public boolean equals(String[] arr1, String[] arr2) {
    //   check lenght for quick failure check
    if (arr1.length != arr2.length) {
        return false;
    }
    for (int i = 0 ; i < arr1.length; i++) {
        if (!arr1[i].equals(arr2[i])) {
            return false;
        }
    }
    return true;
}
