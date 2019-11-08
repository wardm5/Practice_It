public ArrayList<String> removeDuplicates(ArrayList<String> list) {
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < list.size(); i++) {
        if (set.contains(list.get(i))) {
            list.remove(i);
            i--;
        } else 
            set.add(list.get(i));
    }
    return list;
}
