public void stutter(ArrayList<String> list, int k) {
    int size = list.size();
    for (int i = 0; i < size; i++) {
        String temp = list.remove(0);
        for (int j = 0; j < k; j++) {
            list.add(temp);
        }
    }
}
