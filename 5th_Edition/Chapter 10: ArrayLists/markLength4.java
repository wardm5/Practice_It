public void markLength4(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() == 4) {
            list.add(i, "****");
            i++;
        }
    }
}
