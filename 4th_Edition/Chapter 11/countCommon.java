//  Write a method countCommon that takes two Lists of integers as parameters and returns the number of unique 
//  integers that occur in both lists. Use one or more Sets as storage to help you solve this problem.

public int countCommon(List<Integer> arr1, List<Integer> arr2) {
    HashSet<Integer> set = new HashSet<Integer>();
    int count = 0;
    for (int i = 0; i < arr1.size(); i++) {
        set.add(arr1.get(i));
    }
    for (int i = 0; i < arr2.size(); i++) {
        if (set.contains(arr2.get(i))) {
            set.remove(arr2.get(i));
            count++;
        }
    }
    return count;
}
