public boolean isUnique(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++ ) { 
        if (set.contains(arr[i]))
            return false;
            
        set.add(arr[i]);
    }
    return true;
}
