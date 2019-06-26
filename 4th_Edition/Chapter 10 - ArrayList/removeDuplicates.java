//  Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates any duplicates from the list. 

public static void removeDuplicates(ArrayList<String> list1) {
    Set<String> set = new HashSet<String>();
    for (int i = 0; i < list1.size(); i ++) {
        if (set.contains(list1.get(i))) {
            list1.remove(i);
            i--;
        } else {
            set.add(list1.get(i));
        }
    }
}
