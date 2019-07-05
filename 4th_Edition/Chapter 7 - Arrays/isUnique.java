//  Method takes in an int array and determines if all values in the array are unique. O(n) run-time. Space complexity is O(n) due to HashSet.

boolean isUnique(int[] arr) {
    if (arr.length <= 1) {
        return true;
    } 
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
        if (!set.contains(arr[i])) {
            set.add(arr[i]);
        } else {
            return false;
        }
    }
    return true;
}
