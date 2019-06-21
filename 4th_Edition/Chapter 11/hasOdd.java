//  Write a method hasOdd that takes a Set of integers as a parameter and that returns true if the set contains at least one odd integer, and false otherwise. If passed the empty set, your method should return false.

public boolean hasOdd(Set<Integer> set) {
    Iterator<Integer> it = set.iterator();
    while (it.hasNext()) {
        int temp = it.next();
        if (temp % 2 != 0) 
            return true;
    }
    return false;
}
