public void removeShorterStrings(ArrayList<String> list ) {
    for (int i = 1; i < list.size(); i++) {
        if (list.get(i).length() < list.get(i-1).length())
            list.remove(i);
        else 
            list.remove(i-1);
    }
}
