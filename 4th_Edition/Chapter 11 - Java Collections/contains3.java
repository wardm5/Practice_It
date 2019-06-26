//  Write a method contains3 that accepts a List of strings as a parameter and returns true if any single string occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.

public boolean contains3(List<String> list) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0 ; i < list.size(); i++) {
        if (!map.containsKey(list.get(i))) {
            map.put(list.get(i), 1);
        } else {
            int check = map.get(list.get(i)) + 1;
            if (check >= 3)
                return true;
            map.put(list.get(i), check);
        }
    }
    return false;
}
