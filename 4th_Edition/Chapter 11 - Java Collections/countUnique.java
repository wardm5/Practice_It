// Write a method countUnique that takes a List of integers as a parameter and returns the number of unique integer values in the list. 

public static int countUnique(List<Integer> list) {
    Set<Integer> set = new TreeSet<Integer>();
    for (int i = list.size() - 1; i >= 0; i --) {
        set.add(list.get(i));
    }
    return set.size();
}
