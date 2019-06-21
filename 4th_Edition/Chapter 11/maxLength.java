//  Write a method maxLength that takes a Set of strings as a parameter and that returns the length of the longest string in the set. 

public int maxLength(Set<String> set) {
    if (set.size() == 0) 
        return 0;
    int size = 0;
    Iterator<String> it = set.iterator();
    while (it.hasNext()) {
        int length = it.next().length();
        if (length > size) 
            size = length;
    }
    return size;
}
