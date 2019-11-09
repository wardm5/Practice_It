public void filterRange(ArrayList<Integer> list, int a, int b) {
    for (int i = list.size()-1; i >= 0; i--) {
        if (list.get(i) >= a && list.get(i) <= b) 
            list.remove(i);
    }
}
