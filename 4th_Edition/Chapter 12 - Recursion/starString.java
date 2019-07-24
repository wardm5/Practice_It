//  Write a method starString that accepts an integer parameter n and returns a 
//  string of stars (asterisks) 2n long (i.e., 2 to the nth power).

public String starString(int n) {
    return starStringHelper(n).toString();
}

public StringBuilder starStringHelper(int n) {
    if (n <= -1) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return new StringBuilder("*");
    }
    StringBuilder sb = starStringHelper(n - 1);
    StringBuilder newSb = new StringBuilder();
    newSb.append(sb);
    newSb.append(sb);
    return newSb;
}
