public double averageLength(String[] arr) {
    double sum = 0.0;
    for (int i =0 ; i < arr.length; i++) {
        sum += (double) arr[i].length();
    }
    return (double) sum/(arr.length);
}
