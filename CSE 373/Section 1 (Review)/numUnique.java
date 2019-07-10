/*
    Write a method named numUnique that accepts a sorted array of integers as a parameter and that returns the number 
    of unique values in the array. The array is guaranteed to be in sorted order, which means that duplicates will be 
    grouped together.
 */

public int numUnique(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0 ; i < arr.length; i++) {
        set.add(arr[i]);
    }
    return set.size();
}
