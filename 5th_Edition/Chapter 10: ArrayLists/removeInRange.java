public void removeInRange(ArrayList<Integer> list, int val, int start, int end) {
    int countRemoved = 0;
    for (int i = start; i < (end-countRemoved); i++) {
        if (val == list.get(i)) {
            list.remove(i);
            i--;
            countRemoved++;
        }
    }
}
