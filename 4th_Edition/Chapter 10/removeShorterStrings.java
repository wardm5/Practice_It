//  Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair. 

public void removeShorterStrings(ArrayList<String> list) {
    int i = 0;
    while (i + 1 < list.size()) {
        String one = list.get(i);
        String two = list.get(i + 1);
        if (one.length() <= two.length()) {
            list.remove(i);
        } else {
            list.remove(i+1);
            i++;
        }
        i++;
    }
}
