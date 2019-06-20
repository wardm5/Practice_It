//  Method accepts a string and returns the count of the 5 english vowels that the string contains. O(n) run-time.

public int[] vowelCount(String str) {
    if (str == null || str.length() == 0) {
        return new int[5];
    }
    char a = 'a';
    char e = 'e';
    char i = 'i';
    char o = 'o';
    char u = 'u';
    int[] x = new int[5];
    for (int j = 0 ; j < str.length(); j++) {
        char tempChar = str.charAt(j);
        Character.toLowerCase(tempChar);
        if (tempChar == a) {
            x[0] = x[0] + 1;
        } else if (tempChar == e) {
            x[1] = x[1]+ 1;
        } else if (tempChar == i) {
            x[2] = x[2]+ 1;
        } else if (tempChar == o) {
            x[3] = x[3]+ 1;
        }  else if (tempChar == u) {
            x[4] = x[4]+ 1;
        }
    }
    return x;
}
