public int maxLength(ArrayList<String> list) {
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() > max)
            max = list.get(i).length();
    }
    return max;
}
