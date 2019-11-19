public boolean consecutive(int a, int b, int c) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);
    Collections.sort(list);
    return Math.abs(list.get(2) - list.get(1)) == 1 && Math.abs(list.get(1) - list.get(0)) == 1;
}
