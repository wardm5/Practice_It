public void minToFront(ArrayList<Integer> list) {
    int index = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) < list.get(index))
            index = i;
    }
    list.add(0, list.remove(index));
}
